package slideexamples;

import java.io.*;

public class DataIOStream {
    public static void processDataIO(String inputfile) throws Exception {
        int idA = 1234;
        String nameA = "Data  I/O Stream";
        FileOutputStream fos = new FileOutputStream(inputfile);
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeInt(idA);
        dos.writeUTF(nameA);
        dos.close();

        FileInputStream fis = new FileInputStream(inputfile);
        DataInputStream dis = new DataInputStream(fis);

        int Id = dis.readInt();
        System.out.println("Id: " + Id);
        String Name = dis.readUTF();
        System.out.println("Name: " + Name);
        dis.close();
    }
}
