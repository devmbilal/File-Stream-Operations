package slideexamples;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedFileInput {
    public static void readFile(String fileName) throws IOException {
        byte[] buffer = new byte[1024];
        try (BufferedInputStream bi = new BufferedInputStream(new FileInputStream(fileName))) {
            int bytesRead = 0;
            while ((bytesRead = bi.read(buffer)) != -1) {
                String chunk = new String(buffer, 0, bytesRead);
                System.out.print(chunk);
            }
        }
    }
}
