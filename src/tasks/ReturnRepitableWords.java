package tasks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import static tasks.ReturnRepitableWords.pathToFile;


public class ReturnRepitableWords {
    public static void main(String[] args) {


    }


   static String pathToFile = "C:\\Users\\kochukov.e\\Desktop\\textFiles";
    File dir = new File(pathToFile);
    

}


final class MyThread extends Thread {

    @Override
    public void run() {
        try (FileInputStream fis = new FileInputStream(pathToFile)) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
