package com.bandw.branddiary.obs.auth.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bandw.branddiary.obs.auth.entity.AuthUser;

public interface AuthUserRepository extends MongoRepository<AuthUser, Long> {

}
