package org.example.webhooktest.service;

import org.example.webhooktest.entity.Message;
import org.example.webhooktest.repository.MessageRepository;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MessageService {

    private final MessageRepository messageRepository;

    public Message saveMessage(Message message) {
        return (Message) messageRepository.save(message);
    }

    public List getAllMessages() {
        return messageRepository.findAll();
    }

    public Optional getMessageById(Long id) {
        return messageRepository.findById(id);
    }

    public void deleteMessage(Long id) {
        messageRepository.deleteById(id);
    }
}