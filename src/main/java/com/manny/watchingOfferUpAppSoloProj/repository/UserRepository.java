package com.manny.watchingOfferUpAppSoloProj.repository;

import com.manny.watchingOfferUpAppSoloProj.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String>{

}