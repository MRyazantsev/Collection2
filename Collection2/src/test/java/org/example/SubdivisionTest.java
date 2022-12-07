package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {
    Division div = new Division("H");
    @Test
    void getID() {
        assertNotEquals(0, div.getID());
    }

    @Test
    void getName() {
        Division div = new Division("H");
        assertEquals("H", div.getName());
    }
}