import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        reader.close();

        int[][] cube = new int[][] { { 1, 2 }, { 3, 4 } };
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'H') {
                horizontalFlip(cube);
            } else {
                verticalFlip(cube);
            }
        }
        printArray(cube);

    }

    private static int[][] horizontalFlip(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            int temp = array[0][i];
            array[0][i] = array[1][i];
            array[1][i] = temp;
        }
        return array;
    }

    private static int[][] verticalFlip(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            int temp = array[i][0];
            array[i][0] = array[i][1];
            array[i][1] = temp;
        }
        return array;
    }

    private static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}