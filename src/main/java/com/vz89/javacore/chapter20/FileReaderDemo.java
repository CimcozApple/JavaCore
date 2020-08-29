package main.java.com.vz89.javacore.chapter20;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("/Users/Vladimir/IdeaProjects/JavaCore/src/main/java/com/vz89/javacore/chapter20/FileInputStreamDemo.java")) {
            int c;
            while ((c = fr.read()) != -1) System.out.print((char) c);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
