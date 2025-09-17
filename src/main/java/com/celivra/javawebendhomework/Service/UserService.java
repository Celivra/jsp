package com.celivra.javawebendhomework.Service;

import com.celivra.javawebendhomework.DAO.UserDAO;
import com.celivra.javawebendhomework.Model.User;

public class UserService {
    static UserDAO userDAO = new UserDAO();

    public static User getUserByName(String username) {
        return userDAO.getUserByName(username);
    }

    //1:success 2:same username 0:server Error
    public static short addUser(User user) {
        if(getUserByName(user.getUsername()) != null){
            return 2;
        }
        if(userDAO.addUser(user)){
            return 1;
        }else return 0;
    }

}
