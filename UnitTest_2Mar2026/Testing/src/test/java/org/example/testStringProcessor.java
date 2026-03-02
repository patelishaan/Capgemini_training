package org.example;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class testStringProcessor {
    @Test
    public void testConcatenate(){
        StringProcessor s1 = new StringProcessor();
        assertEquals("HelloWorld",s1.concatenate("Hello","World"));
    }
    @Test
    public void testPalindrome(){
        StringProcessor sp = new StringProcessor();
        assertEquals(true,sp.isPalindrome("anna"));
    }
}
