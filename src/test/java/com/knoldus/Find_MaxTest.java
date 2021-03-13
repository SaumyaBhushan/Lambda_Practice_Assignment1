package com.knoldus;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

class Find_MaxTest {

    @Test
    public void findMaxTest() {
        Assertions.assertEquals(20, Find_Max.find_max_no.apply(10, 20));
    }

    @Test
    public void findMaxTestForEqualValues() {
        Assertions.assertEquals(20, Find_Max.find_max_no.apply(20, 20));
    }

    @Test
    public void findMaxTestForNegativeIntValues() {
        Assertions.assertEquals(-4, Find_Max.find_max_no.apply(-29, -4));
    }

//    @Test
//    public void TestForUserInputException() {
//        ScanInput obj = new ScanInput();
//        Assertions.assertThrows(InputMismatchException.class,()->obj.scanUserInput());
//    }

}