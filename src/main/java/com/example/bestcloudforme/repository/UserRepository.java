package com.example.bestcloudforme.repository;

import com.example.bestcloudforme.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

    User getById(int id);
}
