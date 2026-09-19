package com.haitha.portfolio_backend.controller;

import com.haitha.portfolio_backend.entity.ContactMessage;
import com.haitha.portfolio_backend.service.ContactMessageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contact")
@CrossOrigin(origins = "*")
public class ContactMessageController {

    private final ContactMessageService service;

    public ContactMessageController(ContactMessageService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<String> saveMessage(
            @RequestBody ContactMessage contactMessage) {

        service.saveMessage(contactMessage);

        return ResponseEntity.ok(
                "Message received successfully"
        );
    }
}