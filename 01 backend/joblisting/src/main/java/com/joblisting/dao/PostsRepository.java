package com.joblisting.dao;

import com.joblisting.model.Posts;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostsRepository extends MongoRepository<Posts,String> {
}
