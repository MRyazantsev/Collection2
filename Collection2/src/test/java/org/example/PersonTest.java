package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Division d = new Division("1");
    Person p = new Person(1, "1", "1", "1", d, 1);
    @Test
    void getID() {
        assertEquals(1, p.getID());
    }

    @Test
    void getName() {
        assertEquals("1", p.getName());
    }

    @Test
    void getGender() {
        assertEquals("1", p.getGender());
    }

    @Test
    void getBirthday() {
        assertEquals("1", p.getBirthday());
    }

    @Test
    void getDiv() {
        assertEquals(d, p.getDiv());
    }

    @Test
    void getSalary() {
        assertEquals(1, p.getSalary());
    }
}