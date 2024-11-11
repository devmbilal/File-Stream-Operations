package slideexamples;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
    public static void saveAndReadFile(String filename) throws IOException {
        RandomAccessFile rf = new RandomAccessFile(filename, "rw");
        for (int i = 0; i < 10; i++)
            rf.writeByte(i);
        rf.close();
        rf = new RandomAccessFile(filename, "rw");
        rf.seek(5); //seek at byte 5
        rf.writeByte(100); //change value to 100
        rf.close();
        rf = new RandomAccessFile(filename, "r");
        for (int i = 0; i < 10; i++)
            System.out.println("Value " + i + ": " + rf.readByte());
        rf.close();
    }
}
