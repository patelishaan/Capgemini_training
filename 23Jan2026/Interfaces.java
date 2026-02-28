/**
 * Interfaces - contract for behavior, multiple implementation
 * Topic: Programming Foundation with Java - 23 Jan 2026
 */
interface Drawable {
    void draw();
    default void describe() { System.out.println("Drawable"); }
}

interface Resizable {
    void resize(int percent);
}

class Circle implements Drawable, Resizable {
    public void draw() { System.out.println("Drawing circle"); }
    public void resize(int percent) { System.out.println("Resize by " + percent + "%"); }
}

public class Interfaces {
    public static void main(String[] args) {
        Drawable d = new Circle();
        d.draw();
        d.describe();

        Resizable r = new Circle();
        r.resize(50);
    }
}
