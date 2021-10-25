package com.gogetter.bucketlist.repository;

import org.springframework.data.repository.CrudRepository;

import com.gogetter.bucketlist.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
