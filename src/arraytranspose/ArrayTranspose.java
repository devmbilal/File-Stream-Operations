package arraytranspose;

public class ArrayTranspose {

    public static void printArray(int[][] arr) {
        for (int[] row : arr) {
            for (int i : row) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int[][] arr) {
        int[][] transposed = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                transposed[j][i] = arr[i][j];
            }

        }
        return transposed;
    }
}
