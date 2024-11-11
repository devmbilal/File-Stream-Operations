package slideexamples;

import java.io.*;
import java.util.*;
import java.util.zip.*;

public class ZipFileDemo {
    public static void processZipFile(String zipfile,String zipentry) throws Exception {
        // Open the zip file
        ZipFile zipFile = new ZipFile(zipfile);
        
        // Get a single entry from the zip file
        ZipEntry zipEntry = zipFile.getEntry(zipentry);
        if (zipEntry != null) {
            InputStream inputStream = zipFile.getInputStream(zipEntry);
            int i;
            while ((i = inputStream.read()) != -1)
                System.out.print((char) i);
        } else {
            System.out.println("Entry not found in the zip file.");
        }

        // List all entries in a zip file
        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        while (entries.hasMoreElements()) {
            ZipEntry entry = entries.nextElement();
            if (entry.isDirectory()) {
                System.out.println("dir  : " + entry.getName());
            } else {
                System.out.println("file : " + entry.getName());
            }
        }
        zipFile.close();
    }
}
