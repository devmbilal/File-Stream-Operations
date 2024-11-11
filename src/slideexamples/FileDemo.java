package slideexamples;

import java.io.*;

public class FileDemo {
    public static void readFile(String filename) throws Exception {
        try (InputStream f = new FileInputStream(filename)) {
            int size = f.available();
            System.out.println("Bytes available: " + size);
            byte[] buff = new byte[size];
            f.read(buff, 0, size);
            String s = new String(buff);
            System.out.print(s);
        }
    }
}
