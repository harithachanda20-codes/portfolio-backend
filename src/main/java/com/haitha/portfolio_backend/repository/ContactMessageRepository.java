package com.haitha.portfolio_backend.repository;

import com.haitha.portfolio_backend.entity.ContactMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactMessageRepository
        extends JpaRepository<ContactMessage, Long> {

}