package com.example.sarafan2.repo;

import com.example.sarafan2.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepo extends JpaRepository<User, String> {
}
