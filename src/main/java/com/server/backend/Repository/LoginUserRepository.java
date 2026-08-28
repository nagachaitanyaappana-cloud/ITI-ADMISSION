package com.server.backend.Repository;

import com.server.backend.entity.LoginUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginUserRepository extends JpaRepository<LoginUser, Integer> {
    LoginUser findByUserName(String userName);
}
