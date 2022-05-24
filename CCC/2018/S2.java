import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.InputStreamReader;

public class S2 {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());

        int grid[][] = new int[number][number];

        for (int i = 0; i < grid.length; i++) {
            List<Integer> tokens = getTokens(reader.readLine());
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = tokens.get(j);
            }
        }

        int min = grid[0][0];
        int rowMin = 0;
        int colMin = 0;

        // Looking at the sample input, we can see that the lowest number in the table
        // is at one of the 4 corners so by locating this value's indicies we can
        // determine the rotation needed

        if (grid[0][number - 1] < min) {
            rowMin = 0;
            colMin = number - 1;
            min = grid[0][number - 1];
        } else if (grid[number - 1][0] < min) {
            rowMin = number - 1;
            colMin = 0;
            min = grid[number - 1][0];
        } else if (grid[number - 1][number - 1] < min) {
            rowMin = number - 1;
            colMin = number - 1;
            min = grid[number - 1][number - 1];
        }

        // If the rowMin and colMin index are 0 then the minimum number is the top left
        // element so we print the original table
        if (rowMin == 0 && colMin == 0) {
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    System.out.print(grid[i][j] + " ");
                }
                System.out.println();
            }
        }
        // If the rowMin is 0 and the colMin is > 0 then the minimum number is the
        // bottom left element so we rotate the table 90 degrees counter-clock-wise
        else if (rowMin == 0 && colMin > 0) {
            for (int i = grid.length - 1; i >= 0; i--) {
                for (int j = 0; j < grid.length; j++) {
                    System.out.print(grid[j][i] + " ");
                }
                System.out.println();
            }
        }
        // If the rowMin and colMin are > 0 then we flip the table 180 degrees
        // counter-clock-wise
        else if (rowMin > 0 && colMin > 0) {
            for (int i = grid.length - 1; i >= 0; i--) {
                for (int j = grid.length - 1; j >= 0; j--) {
                    System.out.print(grid[i][j] + " ");
                }
                System.out.println();
            }
        }
        // Otherwise we flip the table 270 degrees counter-clock-wise
        else {
            for (int i = 0; i < grid.length; i++) {
                for (int j = grid.length - 1; j >= 0; j--) {
                    System.out.print(grid[j][i] + " ");
                }
                System.out.println();
            }
        }

    }

    private static List<Integer> getTokens(String str) {
        StringTokenizer tokenizer = new StringTokenizer(str, " ");
        List<Integer> tokens = new ArrayList<Integer>();
        while (tokenizer.hasMoreElements()) {
            tokens.add(Integer.parseInt(tokenizer.nextToken()));
        }
        return tokens;
    }

}
