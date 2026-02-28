package SimpleInterface;

public interface File01 {
    public void m1();
    public void m2();
    public void m3();
    default void m4(){
        System.out.println("m4 from interface File01");
    };//concrete methods
}
class B implements File01{
    static void main() {

    }
    @Override
    public void m1() {
        System.out.println("m1 method");
    }

    @Override
    public void m2() {
        System.out.println("m2 method");
    }

    @Override
    public void m3() {
        System.out.println("m3 method");
    }

    static void main(String[] args) {
        B obj = new B();
        obj.m1();
        obj.m4();

    }
}


