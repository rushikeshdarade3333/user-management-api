package com.api.usermanagementapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.usermanagementapi.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
