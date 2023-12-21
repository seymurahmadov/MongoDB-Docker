package com.example.mongodbdocker.repository;


import com.example.mongodbdocker.entity.CarEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends MongoRepository<CarEntity,Long> {

}
