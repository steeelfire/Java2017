package lesson170728.Exceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class FileWithResource {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("start");
        try (FileInputStream fis = new FileInputStream("help.txt")){
            Thread.sleep(20000);
            int read = fis.read();
            System.out.println(read);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
