package com.example.graphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {
    private Circle c = null;

    @BeforeEach
    public void setup() {
        this.c = new Circle();
    }

    @Test
    public void computeCircumferenceTest() {
        assertEquals(c.computeCircumference(2), 12.57, 0.01);
    }

    @Test
    public void computeAreaTest() {
        assertEquals(c.computeArea(2), 12.57, 0.01);
    }

}