package org.example.webhooktest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.example.webhooktest.dto.messageDto;
@Getter
@Setter
@AllArgsConstructor
@Builder
@RequiredArgsConstructor
@Entity
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
    private String imageurl;


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