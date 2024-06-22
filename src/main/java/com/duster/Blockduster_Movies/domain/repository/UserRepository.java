package com.duster.Blockduster_Movies.domain.repository;

import com.duster.Blockduster_Movies.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountName(String accountNumber);
}
