package com.repayment.anything.user.repository;

import com.repayment.anything.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Connection;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUserEmail(String email);

    Boolean existsUserByUserEmail(String email);



}
