package IOstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class DemoCreateTextFile {
    public static void main(String[] args) {

        String text = "Hello jhsvik io os csoc";

        try (FileOutputStream output = new FileOutputStream("src/createTextFile.txt")){
            output.write(text.getBytes());
            System.out.println("file created successfully");
        }catch (IOException e){
            System.out.println(e.getMessage());        }
    }
}
