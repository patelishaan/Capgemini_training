package ObjectReadAndWrite;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
public class ObjectReader {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("data/student.txt"))){
            while(true){
                Student s = (Student) in.readObject();
                System.out.println(s.id+" "+s.name);
            }
        }catch(EOFException e){
            System.out.println("all objects read successfully");
        } catch(Exception e){
            e.printStackTrace();
        }

}}
