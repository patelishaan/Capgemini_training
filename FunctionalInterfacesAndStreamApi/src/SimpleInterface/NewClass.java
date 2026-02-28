package SimpleInterface;

public class NewClass {
    static void main() {
        FuncInterface A = new FuncInterface() {
            @Override
            public void m5() {
                System.out.println("hello");
            }
        };
        A.m5();
    }
}
