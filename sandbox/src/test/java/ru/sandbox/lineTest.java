package ru.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class lineTest {

    @Test
    public void Point() {
        Assert.assertEquals(Point.a, 1.0);
    }
}
