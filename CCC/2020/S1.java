import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.InputStreamReader;
import java.util.Arrays;

public class S1 {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());

        int[][] elements = new int[num][2];

        for (int i = 0; i < num; i++) {
            List<Integer> tokens = getTokens(reader.readLine());
            for (int j = 0; j < 2; j++) {
                elements[i][j] = tokens.get(j);
            }
        }
        
        Arrays.sort(elements, (a, b) -> a[0] - b[0]);

        int currentIndex = 0;
        int previousIndex = 0;
        float currentSpeed = 0;
        float speed = 0;
        for (int[] data : elements) {
            int time = data[0];
            int distance = data[1];
            if (time == 0) {
                currentIndex = distance;
            } else {
                speed = (float) Math.abs((distance - currentIndex) / (float) (time - previousIndex));
                previousIndex = time;
                currentIndex = distance;
                if (currentSpeed < speed) {
                    currentSpeed = speed;
                }
            }
        }
        System.out.println(currentSpeed);

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