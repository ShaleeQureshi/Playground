import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.InputStreamReader;

public class S2 {
    public static void main(String[] args) throws IOException {

        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Reader to get input
        int rowNum = Integer.parseInt(reader.readLine()); // Getting row number
        int colNum = Integer.parseInt(reader.readLine()); // Getting column number

        int[][] elements = new int[rowNum][colNum]; // Creating the matrix

        // Loop to add data to the matrix
        for (int i = 0; i < rowNum; i++) {
            StringTokenizer tokens = new StringTokenizer(reader.readLine(), " "); // Dreating a Tokenizer object
            while (tokens.hasMoreTokens()) {
                for (int j = 0; j < colNum; j++) {
                    elements[i][j] = Integer.parseInt(tokens.nextToken());
                }
            }
        }
        reader.close();
        System.out.println(
                isOut(elements, rowNum, colNum, rowNum, colNum, false, new ArrayList<String>()) ? "yes" : "no");
    }

    private static boolean isOut(int[][] elements, int row, int col, int rowIndex, int colIndex, boolean check,
            List<String> list) {

        boolean flag = false;
        for (int i = 0; i < elements.length; i++)
        {
            for (int j = 0; j < elements[i].length; j++) {
                if (elements[i][j] == (rowIndex * colIndex) && !list.contains(i + "," + j)) {
                    list.add(i + "," + j);
                    flag = true;
                    if (i == 0 && j == 0) {
                        check = true;
                        return check;
                    }
                    boolean out = isOut(elements, row, col, i + 1, j + 1, check, list);
                    if (out) {
                        return out;
                    }
                }
            }
           
        }
        if (!flag) {
            return flag;
        }
        return check;
    }
}
