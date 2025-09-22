package com.celivra.javawebendhomework.DAO;

import com.celivra.javawebendhomework.Model.Post;
import com.celivra.javawebendhomework.Util.DBUtil;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class PostDAO {
    public Post findPostById(Long id) {
        Post post = null;
        String sql = "SELECT * FROM post WHERE id = ?";
        try(Connection c = DBUtil.getConnection(); PreparedStatement ps = c.prepareStatement(sql)){
            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                System.out.println("YES");
                String title = rs.getString("title");
                String content = rs.getString("content");
                LocalDateTime date = rs.getTimestamp("dateTime").toLocalDateTime();
                Long publisherId = rs.getLong("publisherId");
                Integer clickNum = rs.getInt("clickNum");
                post = new Post(id, title, content, publisherId, date, clickNum);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return post;
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
    public List<Post> findAllPost() {
        List<Post> posts = new ArrayList<>();
        String sql = "select * from post order by dateTime desc";
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
}
