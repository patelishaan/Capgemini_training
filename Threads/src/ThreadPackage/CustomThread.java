package ThreadPackage;

class MyThread extends Thread{
    @Override
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
    }
}
class MyOtherThread implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<=20;i++){
            System.out.println(i);
        }
    }
}
public class CustomThread {
    public static void main(String[] args){
        MyThread mt = new MyThread();
        mt.setName("naresh");
        System.out.println(mt.getName());
        System.out.println("the thread id is "+mt.threadId());
        System.out.println("thread priority="+mt.getPriority());
        //mt.run();
        mt.start();
        MyOtherThread mt2 = new MyOtherThread();
        Thread t2 = new Thread(mt2);
        t2.start();

    }
}
