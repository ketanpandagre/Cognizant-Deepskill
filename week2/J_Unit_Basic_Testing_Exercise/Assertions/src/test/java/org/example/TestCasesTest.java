package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestCasesTest {
    @Test
    void testAssertEquals() {
        assertEquals(10, 5+5);
    }

    @Test
    void testAssertNotEquals() {
        assertNotEquals(9, 4 + 5);
    }

    @Test
    void testAssertTrue() {
        assertTrue(5 < 10, "5 is less than 10");
    }

    @Test
    void testAssertFalse() {
        assertFalse(5 > 10, "5 is not greater than 10");
    }

    @Test
    void testAssertNull() {
        String name = null;
        assertNull(name);
    }

    @Test
    void testAssertNotNull() {
        String name = "Ketan";
        assertNotNull(name);
    }

    @Test
    void testAssertSame() {
        String str1 = "hello";
        String str2 = str1;
        assertSame(str1, str2);  // They point to the same object
    }

    @Test
    void testAssertNotSame() {
        String str1 = new String("hello");
        String str2 = new String("hello");
        assertNotSame(str1, str2);  // Different objects, even if equal
    }

    @Test
    void testAssertArrayEquals() {
        int[] expected = {1, 2, 3};
        int[] actual = {1, 2, 3};
        assertArrayEquals(expected, actual);
    }
}