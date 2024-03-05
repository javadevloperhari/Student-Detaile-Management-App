package com.App.FullstackBackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.App.FullstackBackend.model.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
