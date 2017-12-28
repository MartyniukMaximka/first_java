package ru.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

import static ru.sandbox.squareR.roundSquare;

public class squareRTest {
    @Test
    public void Square() {
        roundSquare(20);
        Assert.assertEquals(squareR.s, 2.52, 1.0);

    }
}
