package com.project.event.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.event.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer >{

}
