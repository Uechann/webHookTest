package org.example.webhooktest.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class messageDto {
    private String content;
    private String title;
    private String author;
    private String date;
    private String url;
    private String type;
}
