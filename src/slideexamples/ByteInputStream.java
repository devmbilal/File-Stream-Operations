package slideexamples;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ByteInputStream {
    public static void demonstrateByteInput() {
        String str = "Testing Byte Array Input Stream.";
        byte[] b = str.getBytes();
        try (InputStream bais = new ByteArrayInputStream(b, 0, b.length)) {
            int ch;
            while ((ch = bais.read()) != -1)
                System.out.print((char) ch);
            System.out.println();
            bais.reset();  // using reset() method and reading again
            while ((ch = bais.read()) != -1)
                System.out.print((char) ch);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

