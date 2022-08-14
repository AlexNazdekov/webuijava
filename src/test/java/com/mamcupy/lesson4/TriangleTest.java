package com.mamcupy.lesson4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {
    @Test
    void triangleTest() throws Exception {
        Assertions.assertEquals(TriangleArea.calculateArea(3, 3, 3), 3.89711, 0.001);
    }

    @Test
    void triangleNegativeTest() {
        Assertions.assertThrows(Exception.class, () -> TriangleArea.calculateArea(-3, 3, 3));
    }
}
