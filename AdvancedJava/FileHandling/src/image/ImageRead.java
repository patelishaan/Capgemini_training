package image;

import java.io.FileInputStream;

public class ImageRead {
    public static void main(String args[]){
        String path = "output/copied.png";
        try{
            FileInputStream fis = new FileInputStream(path);
            int size=0;
            while(fis.read()!=-1){
                size++;
            }
            fis.close();
            System.out.println("image read successfully");
        }
    }
}
