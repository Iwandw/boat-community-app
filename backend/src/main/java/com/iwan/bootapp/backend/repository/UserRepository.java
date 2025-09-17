package com.iwan.bootapp.backend.repository;

import com.iwan.bootapp.backend.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
