package com.skypro.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    private final User user = new User("Dmitriy", "dmitriy@yahoo.com");

    @Test
    @DisplayName("Testing the creation of a User object with passing two parameters to it")
    void correctNameTest() {
        assertNotNull(user.getLogin(), user.getEmail());
    }

    @Test
    @DisplayName("Testing for creating an object without passing parameters to it")
    void correctObjectTest() {
        User user = new User();
        assertNull(user.getLogin(), user.getEmail());
    }

    @Test
    @DisplayName("A test that will test whether the correct email address is set")
    void correctEmailTest() {
        if ((user.getEmail().contains("@")) && user.getEmail().contains(".")) {
            assertTrue(true);
        } else
            throw new RuntimeException("Неверный email");
    }

    @Test
    @DisplayName("A test that determines whether login and email are equal")
    void correctEqualityTest() {
        assertNotEquals(user.getLogin(), user.getEmail());
    }
}
