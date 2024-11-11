package slideexamples;

import java.io.*;

public class FileCreateReadOnly {
    public static void createReadOnlyFile(String filename) throws IOException {
        File file = new File(filename);
        if (file.exists()) 
            file.delete();
        file.createNewFile();
        System.out.println("Before. canWrite? " + file.canWrite());
        file.setWritable(false);
        System.out.println("After. canWrite? " + file.canWrite());
    }
}
