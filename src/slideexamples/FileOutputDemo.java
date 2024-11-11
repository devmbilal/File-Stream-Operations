package slideexamples;

import java.io.*;

public class FileOutputDemo {
    public static void writeFileOutput(String filename) {
        String s = "Testing file output stream";
        byte b[] = s.getBytes();
        try {
            FileOutputStream fos = new FileOutputStream(filename);
            fos.write(b, 0, b.length);
            System.out.println(b.length + " bytes are written!");
            fos.close();
        } catch (IOException e) {
            System.out.println("Error creating file!");
        }
      
    }
}
