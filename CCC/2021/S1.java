import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.InputStreamReader;

public class S1 {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(reader.readLine());

        int line1[] = new int[n + 1];
        int line2[] = new int[n];

        List<Integer> list1 = getTokens(reader.readLine());
        List<Integer> list2 = getTokens(reader.readLine());

        for (int i = 0; i < n + 1; i++) {
            line1[i] = list1.get(i);
        }
        for (int i = 0; i < n; i++) {
            line2[i] = list2.get(i);
        }

        double area = 0;

        for (int i = 0; i < n; i++) {
            double newArea = (float) line2[i] * (line1[i] + line1[i + 1]) / 2;
            area = area + newArea;
        }
        System.out.println(area);

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