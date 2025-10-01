package org.example.webhooktest.service;

import org.springframework.stereotype.Service;

@Service
public class TestService6 {

    public String getTest6() {
        return "test6";
    }

    public String getCommon() {
        return "common from TestService6";
    }
}
