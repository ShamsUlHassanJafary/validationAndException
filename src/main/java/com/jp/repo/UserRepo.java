package com.jp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jp.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

    User findByEmailAndPassword(String email, String password);

}
