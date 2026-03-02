package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


public class BankAccountTest {

    @Test
    public void testDeposit(){
        BankAccount b1 = new BankAccount(100);
        b1.deposit(50);
        assertEquals(150, b1.getBalance());
    }
    @Test
    public void testWithdrawSuccess(){
        BankAccount b1 = new BankAccount(100);
        b1.withdraw(50);
        assertEquals(50,b1.getBalance());
    }
    @Test
    public void testWithdrawInsufficientFunds(){
        BankAccount b2 = new BankAccount(100);
        assertThrows(IllegalArgumentException.class,()->b2.withdraw(170));
    }
//    @Test
//    public void testWithdrawSucess
}
