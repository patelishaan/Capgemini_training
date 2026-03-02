package org.example;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class calCTest {

    @Test
    public void testAdd(){
        //create an object of that class and call the
        //add method , give its expected output and the output
        //that the method is giving
        Calculator c1 = new Calculator();
        assertEquals(6,c1.add(3,3));


    }
}
