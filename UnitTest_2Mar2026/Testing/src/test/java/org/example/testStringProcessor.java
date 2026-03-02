package org.example;
import org.junit.Test;

import static org.junit.Assert.*;

public class testStringProcessor {
    @Test
    public void testConcatenate(){
        StringProcessor s1 = new StringProcessor();
        assertEquals("HelloWorld",s1.concatenate("Hello","World"));
    }
    @Test
    public void testConcatenateWithNull(){
        StringProcessor sp = new StringProcessor();
        assertThrows(IllegalArgumentException.class,()->sp.concatenate("hello",null));
    }
    @Test
    public void testPalindrome(){
        StringProcessor sp = new StringProcessor();
        //assertEquals(true,sp.isPalindrome("anna"));
        assertTrue(sp.isPalindrome("anna"));
        //both are correct
    }
}
