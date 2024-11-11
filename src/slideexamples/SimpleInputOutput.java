package slideexamples;

import java.io.IOException;

public class SimpleInputOutput {
    public static void readAndDisplayInput() {
        byte bytearr[] = new byte[30];
        try {
            System.out.println("Enter a line: ");
            System.in.read(bytearr, 0, 30);
            System.out.print("The line typed was: ");
            String str = new String(bytearr);
            System.out.println(str);
        } catch (IOException e) {
            System.err.print("Error occurred:" + e);
        }
    }
}
