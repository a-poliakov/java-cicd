package org.example;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    Calcalator calcalator = new Calcalator();

    @Test
    public void testSum() {
        int a = 2;
        int b = 5;
        Assert.assertEquals(7, calcalator.sum(a, b));
    }

    @Test
    public void testSub() {
        int a = 2;
        int b = 5;
        Assert.assertEquals(-3, calcalator.sub(a, b));
    }
}
