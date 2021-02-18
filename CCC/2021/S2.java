import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2 {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(reader.readLine());
        int n = Integer.parseInt(reader.readLine());

        String array[][] = new String[m][n];

        int k = Integer.parseInt(reader.readLine());
        int numCells = 0;

        for (int i = 0; i < k; i++) {
            String pass[] = (reader.readLine().split(" ", 2));
            if (pass[0].equals("R")) {
                numCells = change(array, pass[0], Integer.parseInt(pass[1]) - 1, 0, numCells);
            } else {
                numCells = change(array, pass[0], 0, Integer.parseInt(pass[1]) - 1, numCells);
            }

        }

        System.out.println(numCells);

    }

    private static int change(String[][] array, String rowOrCol, int rowNum, int colNum, int numCells) {

        if (rowOrCol.equals("R")) {
            for (int i = 0; i < array[rowNum].length; i++) {
                if (array[rowNum][i] != null) {
                    if (array[rowNum][i].equals("B")) {
                        array[rowNum][i] = "G";
                        numCells++;
                    } else {
                        array[rowNum][i] = "B";
                        numCells--;
                    }
                } else {
                    array[rowNum][i] = "G";
                    numCells++;
                }
            }
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i][colNum] != null) {
                    if (array[i][colNum].equals("B")) {
                        array[i][colNum] = "G";
                        numCells++;
                    } else {
                        array[i][colNum] = "B";
                        numCells--;
                    }
                } else {
                    array[i][colNum] = "G";
                    numCells++;
                }
            }
        }

        return numCells;
    }
}
