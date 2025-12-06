package IOstream;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DemoBufferReader {

    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("src/demo.txt"))){
            String line;
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }catch(Exception e){
            System.out.println("Error reading file.");
        }

    }

}
