package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testAddition() {
        int result = 10 + 20;
        assertEquals(30, result);
    }

    @Test
    void testMessage() {
        String message = "CI/CD Pipeline";
        assertEquals("CI/CD Pipeline", message);
    }
}
