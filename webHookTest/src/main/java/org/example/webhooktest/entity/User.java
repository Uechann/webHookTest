package org.example.webhooktest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Builder;

import lombok.RequiredArgsConstructor;
import org.example.webhooktest.entity.Message;

@Entity
@Builder
@RequiredArgsConstructor
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private String email;
    private String password;

    @OneToMany(mappedBy = "message")
    @JoinColumn(name = "message_id")
    private Message message;
}
