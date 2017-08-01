package com.bandw.branddiary.oss.auth.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bandw.branddiary.oss.auth.model.AuthUser;

public interface AuthUserRepository extends MongoRepository<AuthUser, Long> {

}
