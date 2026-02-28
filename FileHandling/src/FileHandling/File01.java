package FileHandling;
import java.io.File;
public class File01 {
    static void main() {
        //System.out.println("hello world");
        File folder = new File("data");
        if(!folder.exists()){
            boolean created = folder.mkdir();
            if(created){
                System.out.println("folder created success");
            } else{
                System.out.println("folder creation failed");
            }
        }
        else{
            System.out.println("folder already exists");
        }
    }
}
