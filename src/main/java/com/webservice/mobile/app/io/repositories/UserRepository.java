package com.webservice.mobile.app.io.repositories;

import com.webservice.mobile.app.io.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CrudRepository<UserEntity,Long> {

    UserEntity findUserByEmail(String email);

    UserEntity findByUserId(String userId);
}
