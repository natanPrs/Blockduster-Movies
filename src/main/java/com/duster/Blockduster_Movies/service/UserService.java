package com.duster.Blockduster_Movies.service;

import com.duster.Blockduster_Movies.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);

}
