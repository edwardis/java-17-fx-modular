package com.example.graphics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {
    private Rectangle r = null;

    @BeforeEach
    public void setup() {
        this.r = new Rectangle();
    }

    @Test
    public void computeCircumferenceTest() {
        assertEquals(r.computeCircumference(2,5), 14, 0.00);
    }

    @Test
    public void computeAreaTest() {
        assertEquals(r.computeArea(2,5), 10, 0.00);
    }

}