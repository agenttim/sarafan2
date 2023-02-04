package com.example.sarafan2.repo;

import com.example.sarafan2.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message, Long> {
}
