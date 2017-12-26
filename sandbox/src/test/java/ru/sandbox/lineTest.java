package ru.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

import static ru.sandbox.Point.line;

public class lineTest {

    @Test
    public void Point() {
        line(1,3,1,3);
        Assert.assertEquals(Point.a, 2.8, 0.1);
    }
}
