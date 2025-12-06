package IOstream;
import java.io.IOException;

import java.io.FileInputStream;

public class IOstreamRead {
    public static void main(String[] args) {
        System.out.println("hello");

        try(FileInputStream input = new FileInputStream("src/demo.txt")){

            int i;

            while((i = input.read()) != -1) {
                System.out.println((char) i);
            }
        }catch(Exception e){
            System.out.println("error findin file");
        }

    }

}
