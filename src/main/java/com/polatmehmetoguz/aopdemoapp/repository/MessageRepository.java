package com.polatmehmetoguz.aopdemoapp.repository;

import com.polatmehmetoguz.aopdemoapp.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Message,Long> {
}
