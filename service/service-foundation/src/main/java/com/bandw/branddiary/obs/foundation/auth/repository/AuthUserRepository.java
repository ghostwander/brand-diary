package com.bandw.branddiary.obs.foundation.auth.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bandw.branddiary.obs.foundation.auth.entity.AuthUser;

public interface AuthUserRepository extends MongoRepository<AuthUser, Long> {

}
