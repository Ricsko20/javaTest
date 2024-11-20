package tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeglalapTest {
    Teglalap tl = new Teglalap();

    @Test
    void testKerulet() {
        assertEquals(10, tl.kerulet(2, 3));;
    }

    @Test
    void testTerulet() {
        assertEquals(9, tl.terulet(3, 3));
    }

    @Test
    void testKeruletNot() {
        assertNotEquals(10, tl.kerulet(3, 3));
    }
}