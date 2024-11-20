package tests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DetermineLetterGradeTest {
    DetermineLetterGrade lg = new DetermineLetterGrade();

    @Test
    void testNumberOne() {
        assertEquals('A', lg.determine(92));
    }

    @Test
    void testNumberTwo() {
        assertEquals('B', lg.determine(82));
    }

    @Test
    void testNumberThree() {
        assertEquals('C', lg.determine(72));
    }

    @Test
    void testNumberFour() {
        assertEquals('D', lg.determine(62));
    }

    public static class Teglalap {
        public double kerulet(double a, double b) {
            return 2 * (a+b);
        }
        public double terulet(double a, double b) {
            return a * b;
        }
    }
}