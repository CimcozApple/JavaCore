package main.java.com.vz89.javacore.chapter21;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DirList {
    public static void main(String[] args) {
        String dirname = "\\MyDir";

        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get(dirname))){

            System.out.println("Каталог " + dirname);

            for (Path entry: directoryStream) {
                BasicFileAttributes attributes = Files.readAttributes(entry,BasicFileAttributes.class);
                if (attributes.isDirectory()) System.out.println("<DIR> ");
                else System.out.println("           ");
                System.out.println(entry.getName(1));
            }
        } catch (InvalidPathException | IOException e) {
            e.printStackTrace();
        }

    }
}
