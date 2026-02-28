package FileHandling;
import java.io.File;
public class CreateFile {
    static void main() {
        File file = new File("data/student.txt");
        try{
            if(file.createNewFile()){
                System.out.println("file created successfully");
            }else{
                System.out.println("File already exists");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
