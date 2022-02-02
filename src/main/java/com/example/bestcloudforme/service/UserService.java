package com.example.bestcloudforme.service;

import com.example.bestcloudforme.domain.User;
import com.example.bestcloudforme.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getByUserId(int id){
        return userRepository.getById(id);
    }

}
