package com.joblisting.dao;

import com.joblisting.model.Posts;
import com.mongodb.client.AggregateIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.convert.MongoConverter;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.List;


@Component
public class SearchRepoImpl implements SearchRepository{

    @Autowired
    private MongoClient client;

    @Autowired
    private MongoConverter converter;

    @Override
    public List<Posts> findByText(String text) {

        final List<Posts> posts = new ArrayList<>();
        MongoDatabase database = client.getDatabase("joblisting");
        MongoCollection<Document> collection = database.getCollection("JobPost");

        AggregateIterable<Document> result = collection.aggregate(Arrays.asList(new Document("$search",
                        new Document("text",
                                new Document("query", text)
                                        .append("path", Arrays.asList("profile","techs")))),
                new Document("$sort",
                        new Document("exp", 1L)),
                new Document("$limit", 2L)));

        result.forEach(doc -> posts.add(converter.read(Posts.class,doc)));
        return posts;
    }
}
