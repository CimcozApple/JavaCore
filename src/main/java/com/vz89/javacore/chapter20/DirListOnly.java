package main.java.com.vz89.javacore.chapter20;

import java.io.File;
import java.io.FilenameFilter;

class OnlyExt implements FilenameFilter {
    String ext;

    public OnlyExt(String ext) {
        this.ext = ext;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}


public class DirListOnly {
    public static void main(String[] args) {
        String dirname = "/Program Files";
        File f1 = new File(dirname);
        FilenameFilter only = new OnlyExt("Windows");
        String[] s = f1.list(only);

        for (String sEl: s) {
            System.out.println(sEl);
        }

    }
}
