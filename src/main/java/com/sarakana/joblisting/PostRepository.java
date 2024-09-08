package com.sarakana.joblisting;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.sarakana.joblisting.model.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {}
