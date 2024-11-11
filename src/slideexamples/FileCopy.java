package slideexamples;

import java.io.*;

public class FileCopy {
    public static void copyFile(String InputFile, String OutputFile) throws IOException {
        FileInputStream fin = new FileInputStream(InputFile);
        FileOutputStream fout = new FileOutputStream(OutputFile);
        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = fin.read(buffer)) > 0) {
            fout.write(buffer, 0, bytesRead);
        }
        fin.close();
        fout.close();
    }
}
