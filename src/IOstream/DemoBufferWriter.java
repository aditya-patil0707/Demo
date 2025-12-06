package IOstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DemoBufferWriter {

    public static void main(String[] args) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/createTextFile.txt"))) {
            bw.write("First line");
            bw.newLine();
            bw.write("Second line");
            System.out.println("success");
        } catch (IOException e) {
            System.out.println("Error writing file");
        }
    }
}
