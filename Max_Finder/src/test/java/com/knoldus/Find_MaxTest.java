package com.knoldus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Find_MaxTest {
    Find_Max find_max = new Find_Max();

    @Test
    public void findMaxTest() {
        Assertions.assertEquals(20, find_max.findMaxBtwNumber("10", "20"));
    }

    @Test
    public void findMaxTestForEqualValues() {
        Assertions.assertEquals(20, find_max.findMaxBtwNumber("20", "20"));
    }

    @Test
    public void check()  {
        Assertions.assertThrows(NumberFormatException.class, () -> {
            find_max.findMaxBtwNumber("anuradha", "priya");
        });

    }
}


