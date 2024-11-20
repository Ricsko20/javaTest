package tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromTest {
    Palindrom p = new Palindrom();

    @Test
    void elsoTest() {
        assertTrue(p.isPalindrom("gorog"));
    }
}