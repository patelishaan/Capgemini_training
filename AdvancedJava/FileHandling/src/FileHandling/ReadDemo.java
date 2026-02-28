package FileHandling;
import ObjectReadAndWrite.Student;

import java.io.*;

public class ReadDemo {

    public static void main(String[] args) {
        try {
            BufferedReader reader =
                    new BufferedReader(new FileReader("data/student.txt"));
            ObjectInputStream reader2 = new ObjectInputStream(new FileInputStream("data/student.txt"));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }




            reader.close();   // correct close

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}