package FunctionalInterface;

class B{
    public void m1(int[] arr){
        System.out.println("Array arg method");
    }
}
public class Test {
    static void main() {
        B b1 = new B();
        b1.m1(null);
    }
}
