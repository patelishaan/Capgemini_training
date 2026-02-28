/**
 * equals() and hashCode() - object comparison and hash-based collections
 * Topic: Programming Foundation with Java - 29 Jan 2026
 */
import java.util.Objects;

class Person {
    String name;
    int id;
    Person(String name, int id) { this.name = name; this.id = id; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}

public class EqualsAndHashCode {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", 1);
        Person p2 = new Person("Alice", 1);
        Person p3 = new Person("Bob", 2);

        System.out.println("p1.equals(p2): " + p1.equals(p2));
        System.out.println("p1.equals(p3): " + p1.equals(p3));
        System.out.println("p1.hashCode(): " + p1.hashCode());
        System.out.println("p2.hashCode(): " + p2.hashCode());
    }
}
