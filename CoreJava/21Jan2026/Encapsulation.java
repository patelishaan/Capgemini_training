/**
 * Encapsulation - bundling data and methods, data hiding via private fields
 * Topic: Programming Foundation with Java - 21 Jan 2026
 */
public class Encapsulation {
    private String name;
    private int age;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) {
        if (age > 0 && age < 150) this.age = age;
    }

    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        e.setName("Alice");
        e.setAge(25);
        System.out.println(e.getName() + ", " + e.getAge());
        e.setAge(-5);  // ignored
        System.out.println("Age after invalid set: " + e.getAge());
    }
}
