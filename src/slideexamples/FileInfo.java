package slideexamples;

import java.io.*;
import java.util.Scanner;

public class FileInfo {
    public static void printFileInfo(String s) {
        System.out.println(s);
    }

    public static void checkFileInfo(String[] args) {
        String fi;
        Scanner in = new Scanner(System.in);
        fi = in.next();
        File f1 = new File(fi);
        printFileInfo(f1.getName() + (f1.exists() ? " exists" : " does not exist"));
        printFileInfo("File size: " + f1.length() + " bytes");
        printFileInfo("Is" + (f1.isDirectory() ? " a directory" : " not a directory"));
        printFileInfo(f1.getName() + (f1.canWrite() ? " is writable" : " is not writable"));
        printFileInfo(f1.getName() + (f1.canRead() ? " is readable" : " is not readable"));
        printFileInfo("File was last modified: " + f1.lastModified());
        in.close();
    }
}
