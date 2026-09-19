package com.haitha.portfolio_backend.service;

import com.haitha.portfolio_backend.entity.ContactMessage;
import com.haitha.portfolio_backend.repository.ContactMessageRepository;
import org.springframework.stereotype.Service;

@Service
public class ContactMessageService {

    private final ContactMessageRepository repository;

    public ContactMessageService(ContactMessageRepository repository) {
        this.repository = repository;
    }

    public ContactMessage saveMessage(ContactMessage contactMessage) {
        return repository.save(contactMessage);
    }
}