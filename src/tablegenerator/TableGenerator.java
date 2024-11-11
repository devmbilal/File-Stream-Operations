//	Write a Java program that prints multiplication tables up to 10.

package tablegenerator;

public class TableGenerator {
    public static void printTable() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
