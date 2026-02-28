package image;
import java.io.*;
public class ImageStore {
    public static void main(String args[]){
        String sourePath = "Images/img.png";
        String destinationPath = "output/copied.png";
        try{
            FileInputStream fis = new FileInputStream(sourePath);
            FileOutputStream fos = new FileOutputStream(destinationPath);

            byte[] buffer = new byte[1024];
            int bytesRead;

            while((bytesRead = fis.read(buffer))!=-1){
                fos.write(buffer, 0, bytesRead);
            }
            fis.close();
            fos.close();
            System.out.println("image stored successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
