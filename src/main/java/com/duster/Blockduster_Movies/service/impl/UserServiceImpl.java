package com.duster.Blockduster_Movies.service.impl;

import com.duster.Blockduster_Movies.domain.model.User;
import com.duster.Blockduster_Movies.domain.repository.UserRepository;
import com.duster.Blockduster_Movies.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if (userRepository.existsByAccountName(userToCreate.getAccount().getName())) {
            throw new IllegalArgumentException("This Username already exists");
        }
        return userRepository.save(userToCreate);
    }
}
