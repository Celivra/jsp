package com.celivra.javawebendhomework.DAO;

import com.celivra.javawebendhomework.Model.User;
import com.celivra.javawebendhomework.Util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
    public static User getUserByName(String username) {
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
}
