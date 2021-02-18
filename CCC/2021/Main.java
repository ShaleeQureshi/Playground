import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    private static int numCells = 0;

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());

        String array[][] = new String[m][n];

        int k = Integer.parseInt(reader.readLine());

        for (int i = 0; i < k; i++) {
            String pass[] = (reader.readLine().split(" ", 2));
            if (pass[0].equals("R")) {
                array = changeR(array, n, Integer.parseInt(pass[1]) - 1, 0);
            } else {
                array = changeC(array, m, Integer.parseInt(pass[1]) - 1, 0);
            }

        }

        System.out.println(numCells);

    }

    private static String[][] changeR(String[][] array, int n, int rowNum, int index) {

        if (n == index + 1) {
            return array;
        }

        array[rowNum][index] = changeLetter(array[rowNum][index]);
        changeR(array, n, rowNum, index + 1);

        return array;

    }

    private static String[][] changeC(String[][] array, int n, int colNum, int index) {

        if (n == index + 1) {
            return array;
        }

        array[index][colNum] = changeLetter(array[index][colNum]);
        changeR(array, n, colNum, index + 1);

        return array;

    }

    private static String changeLetter(String letter) {
        if (letter != null) {
            if (letter.equals("B")) {
                numCells++;
                return "G";
            } else {
                numCells--;
                return "B";
            }
        } else {
            numCells++;
            return "G";
        }
    }
}
