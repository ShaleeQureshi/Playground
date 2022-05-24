import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.util.Arrays;

public class S3 {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int friendsN = Integer.parseInt(reader.readLine());

        int friendStats[][] = new int[friendsN][3];

        for (int i = 0; i < friendStats.length; i++) {
            List<Integer> list = getTokens(reader.readLine());
            for (int j = 0; j < 3; j++) {
                friendStats[i][j] = list.get(j);
            }
        }

        Arrays.sort(friendStats, (a, b) -> a[0] - b[0]);

        // for (int i = 0; i < friendStats.length; i++) {
        // for (int j = 0; j < 3; j++) {
        // System.out.print(friendStats[i][j] + " ");
        // }
        // System.out.println();
        // }
        for (int i = friendStats[0][0]; i < friendStats[friendStats.length - 1][0]; i++) {

        }
        long time = Long.MAX_VALUE;
        for (int i = 0; i < friendStats.length - 1; i++) {
            long newTime = 0;
            int position = (friendStats[i][0] - friendStats[i + 1][0]) / 2;
            int num1 = Math.abs(friendStats[i][0] - position);
            int num2 = Math.abs(friendStats[i + 1][0] - position);
            if (num1 < num2) {
                newTime = friendStats[i][1] * num1 + friendStats[i + 1][1] * num2;
            }
            if (newTime < time) {
                time = newTime;
            }
        }
        System.out.println(time);

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
