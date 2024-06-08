package com.joblisting.dao;

import com.joblisting.model.Posts;
import org.springframework.stereotype.Component;

import java.util.List;

public interface SearchRepository {

    List<Posts> findByText(String text);
}
