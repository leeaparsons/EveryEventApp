package com.example.everyevent.repo;

import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.everyevent.entity.EveryEvent;

import java.util.List;

@Repository
public interface EveryEventRepository extends MongoRepository<EveryEvent, String> {
    
    // custom queries - find by country
    @Aggregation(pipeline = {
        "{match: {country: {$regex: '^?0'}}}"
    })
    List<EveryEvent> findByCountry(String country);
}
