package com.celivra.javawebendhomework.Service;

import com.celivra.javawebendhomework.DAO.UserDAO;
import com.celivra.javawebendhomework.Model.User;

public class UserService {
    static UserDAO userDAO = new UserDAO();

    public static User getUserByName(String username) {
        return userDAO.getUserByName(username);
    }
    public static boolean addUser(User user) {
        return userDAO.addUser(user);
    }

}
