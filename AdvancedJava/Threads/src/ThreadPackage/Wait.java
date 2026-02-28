package ThreadPackage;

class SleepDemo extends Thread{
    public void run(){
        for(int i=0;i<=3;i++){
            System.out.println("Running"+i);
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class Wait {
    public static void main(String[] args){
        SleepDemo sleepy = new SleepDemo();
        sleepy.start();
    }
}
