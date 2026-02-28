/**
 * Enums - named constants, type-safe
 * Topic: Programming Foundation with Java - 28 Jan 2026
 */
enum Day { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }

enum Status {
    PENDING("Waiting"),
    ACTIVE("Running"),
    DONE("Completed");
    private final String desc;
    Status(String desc) { this.desc = desc; }
    String getDesc() { return desc; }
}

public class Enums {
    public static void main(String[] args) {
        Day d = Day.WEDNESDAY;
        System.out.println("Day: " + d);
        System.out.println("Ordinal: " + d.ordinal());
        System.out.println("Values: " + java.util.Arrays.toString(Day.values()));

        Status s = Status.ACTIVE;
        System.out.println("Status: " + s + " - " + s.getDesc());
    }
}
