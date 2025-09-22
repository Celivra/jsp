package com.celivra.javawebendhomework.DAO;

import com.celivra.javawebendhomework.Model.User;
import com.celivra.javawebendhomework.Util.DBUtil;

import java.sql.*;

public class UserDAO {
    public User getUserById(Long id) {
        String sql = "select * from users where id= ?";
        User user = null;
        try(Connection c = DBUtil.getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, id.toString());
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                String username = rs.getString("username");
                String password = rs.getString("password");
                user = new User(username, password);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return user;
    }
    public User getUserByName(String username) {
        String sql = "select * from users where username= ?";
        User user = null;
        try(Connection c = DBUtil.getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                String password = rs.getString("password");
                user = new User(username, password);
            }

        }catch (SQLException e){
            e.printStackTrace();
        }
        return user;
    }
    public boolean addUser(User user) {
        String sql = "insert into users (username, password) values (?, ?)";
        try(Connection c = DBUtil.getConnection(); PreparedStatement ps = c.prepareStatement(sql)) {
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.executeQuery();
            return true;
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }
}
