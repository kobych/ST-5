package com.mycompany.app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SqrtTest {
    @Test
    public void testAverage() {
        Sqrt sqrt = new Sqrt(0);
        assertEquals(5.0, sqrt.average(4.0, 6.0), 0.0001);
    }

    @Test
    public void testGoodGuess() {
        Sqrt sqrt = new Sqrt(4.0);
        assertTrue(sqrt.good(2.0, 4.0));
    }

    @Test
    public void testNotGoodGuess() {
        Sqrt sqrt = new Sqrt(4.0);
        assertFalse(sqrt.good(1.9, 4.0));
    }

    @Test
    public void testImprove() {
        Sqrt sqrt = new Sqrt(16.0);
        double improved = sqrt.improve(4.0, 16.0);
        assertEquals(4.0, improved, 0.0001);
    }

    @Test
    public void testCalcPerfectSquare() {
        Sqrt sqrt = new Sqrt(25.0);
        assertEquals(5.0, sqrt.calc(), 0.0001);
    }

    @Test
    public void testCalcNonPerfectSquare() {
        Sqrt sqrt = new Sqrt(2.0);
        assertEquals(1.4142, sqrt.calc(), 0.0001);
    }

    @Test
    public void testCalcZero() {
        Sqrt sqrt = new Sqrt(0.0);
        assertEquals(0.0, sqrt.calc(), 0.0001);
    }

    @Test
    public void testCalcOne() {
        Sqrt sqrt = new Sqrt(1.0);
        assertEquals(1.0, sqrt.calc(), 0.0001);
    }

    @Test
    public void testCalcLargeNumber() {
        Sqrt sqrt = new Sqrt(1000000.0);
        assertEquals(1000.0, sqrt.calc(), 0.0001);
    }

    @Test
    public void testCalcSmallNumber() {
        Sqrt sqrt = new Sqrt(0.0001);
        assertEquals(0.01, sqrt.calc(), 0.0001);
    }
}