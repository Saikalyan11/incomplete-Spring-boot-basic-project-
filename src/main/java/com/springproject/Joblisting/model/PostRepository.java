package com.springproject.Joblisting.model;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {

    // this Mongo Repository which we have extended will takecare CRUD operations

}
