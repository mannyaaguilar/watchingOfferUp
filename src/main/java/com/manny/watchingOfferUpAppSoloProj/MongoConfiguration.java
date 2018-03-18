package com.manny.watchingOfferUpAppSoloProj;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@Configuration
@EnableMongoRepositories(basePackages = "com.manny.watchingOfferUpAppSoloProj.repository")
public class MongoConfiguration extends AbstractMongoConfiguration{


    @Override
    protected String getDatabaseName() {
        return "simpleUserInfo";
    }

    @Override
    public Mongo mongo() throws Exception {
        return new MongoClient("127.0.0.1", 27017);
    }
}
