package com.bandw.branddiary.auth.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bandw.branddiary.auth.model.AuthUser;

public interface AuthUserRepository extends MongoRepository<AuthUser, Long> {

}
