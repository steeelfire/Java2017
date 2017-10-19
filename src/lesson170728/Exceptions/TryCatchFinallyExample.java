package lesson170728.Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchFinallyExample {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("help.txt");

            try {
                int read = fis.read();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            } finally {
                fis.close();
            }

        }catch(FileNotFoundException e){

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
