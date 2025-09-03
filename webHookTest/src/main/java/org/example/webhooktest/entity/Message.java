package org.example.webhooktest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.example.webhooktest.dto.messageDto;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Builder
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    private String title;
    private String author;
    private String date;
    private String url;
    private String type;

    public Message(String content, String title, String author, String date, String url, String type) {
        this.content = content;
        this.title = title;
        this.author = author;
        this.date = date;
        this.url = url;
        this.type = type;
    }

    public messageDto entityToDto() {
        return messageDto.builder()
                .content(this.content)
                .title(this.title)
                .author(this.author)
                .date(this.date)
                .url(this.url)
                .type(this.type)
                .build();

    }
}