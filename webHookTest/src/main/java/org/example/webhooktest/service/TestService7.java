package org.example.webhooktest.service;

import org.springframework.stereotype.Service;

@Service
public class TestService7 {
    public String getTest7() {
        return "test7";
    }

    public String getCommon() {
        return "common from TestService7";
    }
}
