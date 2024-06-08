package com.joblisting.controller;


import com.joblisting.dao.PostsRepository;
import com.joblisting.dao.SearchRepository;
import com.joblisting.model.Posts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class PostController {

    @Autowired
    private PostsRepository postsRepository;

    @Autowired
    private SearchRepository searchRepository;

    @RequestMapping(value = "/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping("/posts")
    public List<Posts> getAllPosts(){
        return postsRepository.findAll();
    }

    @PostMapping("/post")
    public Posts addPost(@RequestBody Posts posts){
        return postsRepository.save(posts);
    }

    @GetMapping("/posts/{text}")
    public List<Posts> findByText(@PathVariable String text){
        return searchRepository.findByText(text);
    }
}
