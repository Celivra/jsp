package com.celivra.javawebendhomework.DAO;

import com.celivra.javawebendhomework.Model.Post;
import com.celivra.javawebendhomework.Util.DBUtil;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PostDAO {
    public List<Post> findAllPost() {
        List<Post> posts = new ArrayList<>();
        String sql = "select * from post";
        try(Connection c = DBUtil.getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Long id = rs.getLong("id");
                String title = rs.getString("title");
                String content = rs.getString("content");
                Long publisherId = rs.getLong("publisherId");
                LocalDateTime date = rs.getTimestamp("dateTime").toLocalDateTime();
                Integer clickNum = rs.getInt("clickNum");
                posts.add(new Post(id,title,content, publisherId, date, clickNum));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return posts;
    }
    public boolean addPost(Post post) {
        String sql = "insert into post(title, publisherId, content, dateTime, clickNum) values(?,?,?,?)";
        try(Connection c = DBUtil.getConnection(); PreparedStatement ps = c.prepareStatement(sql)){
            ps.setString(1, post.getTitle());
            ps.setLong(2, post.getPublisherId());
            ps.setString(3, post.getContent());
            ps.setString(4, post.getDateTime().toString());
            ps.setInt(5, post.getClickNum());
            ps.executeUpdate();
            return true;
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }
}
