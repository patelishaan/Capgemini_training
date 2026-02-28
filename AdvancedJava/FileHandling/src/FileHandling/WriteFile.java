package FileHandling;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WriteFile {
    static void main() {
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("/student.txt"));
            writer.write("\nName - Ishaan");
            writer.newLine();
            writer.write("Course : Summer");
            writer.newLine();
            writer.write("Marks - 99");
            writer.close();
            System.out.println("data written");

        }catch (Exception e){
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
