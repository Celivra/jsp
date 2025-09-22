package com.celivra.javawebendhomework.Service;

import com.celivra.javawebendhomework.DAO.PostDAO;
import com.celivra.javawebendhomework.Model.Post;

import java.util.List;

public class PostService {
    static PostDAO postDAO = new PostDAO();
    public static Post findPostById(Long id) {
        return postDAO.findPostById(id);
    }
    public static List<Post> findAllPost() {
        return postDAO.findAllPost();
    }
    public static boolean addPost(Post post) {
        return postDAO.addPost(post);
    }
}
