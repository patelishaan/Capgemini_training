package org.example;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class calCTest {
    Calculator c1 = new Calculator();

    @Test
    public void testAdd(){
        //create an object of that class and call the
        //add method , give its expected output and the output
        //that the method is giving

        assertEquals(6,c1.add(3,3));
    }
    @Test
    public void testMul(){
        assertEquals(12, c1.multiply(3,4));
    }
    @Test
    public void testDiv(){
        assertEquals(2.0,c1.division(6,3));
    }
    @Test
    public void testSub(){
        assertEquals(2,c1.subtract(4,2));
    }
}
