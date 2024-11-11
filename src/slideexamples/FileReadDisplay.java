package slideexamples;

import java.io.*;

public class FileReadDisplay {
    public static void displayFileContents(String filename) throws Exception {
        try (FileInputStream fis = new FileInputStream(filename)) {
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i + " ");
            }
        }
    }
}
