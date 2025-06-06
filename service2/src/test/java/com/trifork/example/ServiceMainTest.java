package com.trifork.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ServiceMainTest {
    @Test
    void getGreeting() {
        assertEquals("Hello, Worlds!", ServiceMain2.getGreeting());
    }

}