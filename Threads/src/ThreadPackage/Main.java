package ThreadPackage;

class BankAccount{
    int balance=1000;
    public synchronized void withdraw(int amount)throws InterruptedException{
        if(balance<amount){
            System.out.println("Insufficient balance...");

        }
        balance = balance-amount;
        System.out.println(Thread.currentThread().getName()+"completed withdrawal");
        System.out.println("remaining balance = "+balance);

    }
    public synchronized void deposit(int amount){
        System.out.println(Thread.currentThread().getName()+"entered deposit");
        System.out.println(Thread.currentThread().getName()+"acquired lock on bank account");
        balance = balance+amount;
        System.out.println(Thread.currentThread().getName()+"deposited amount");
        System.out.println("Updated Balance = "+balance);
        //notify() wakes up the thread
        notify();
        System.out.println(Thread.currentThread().getName()+"sent NOTIFY signal");
        //Lock will be released only after method ends
        System.out.println(Thread.currentThread().getName()+"releasing LOCK");
    }
}
public class Main {
}
