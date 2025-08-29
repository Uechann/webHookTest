package org.example.webhooktest.service;

import org.example.webhooktest.entity.Message;
import org.example.webhooktest.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageService {

    private final MessageRepository messageRepository;

    @Autowired
    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public Message saveMessage(Message message) {
        return (Message) messageRepository.save(message);
    }

    public List getAllMessages() {
        return messageRepository.findAll();
    }

    public Optional getMessageById(Long id) {
        return messageRepository.findById(id);
    }

}