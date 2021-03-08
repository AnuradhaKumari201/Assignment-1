package com.knoldus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Find_MaxTest {

    @Test
    public void findMaxTest(){
        Assertions.assertEquals(20,Find_Max.find_max_no.apply(10, 20));
    }
    @Test
    public void findMaxTestForEqualValues(){
        Assertions.assertEquals(20,Find_Max.find_max_no.apply(20, 20));
    }

}