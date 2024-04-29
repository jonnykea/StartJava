package tasks;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

import static java.nio.file.StandardCopyOption.ATOMIC_MOVE;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class MoveFile {
    public static void main(String[] args) throws IOException {
        String test = "3edbf191c1e0623cdb25121a728005b7fdd5ae5f";
        String test2 = "com.googlecode.owasp-java-html-sanitizer";
        File dir = new File("C:\\test"); //  "C:\\Users\\Username\\Desktop\\testFile111.txt"
        System.out.println(dir.isDirectory());
        getFiles(dir);
    }


    private static void getFiles(File dir) throws IOException {
        File[] files = dir.listFiles();
        for (File element : files) {
            if (element.getName().length() >= 39) {
                File file = Arrays.stream(element.listFiles()).findFirst().get();
                Files.move(file.toPath(), Paths.get(element.getParent() +"/"+ file.getName()));
                Files.delete(element.toPath());
            } else {
                getFiles(element);
            }
        }
    }
}