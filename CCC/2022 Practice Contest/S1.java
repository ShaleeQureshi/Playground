import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.io.InputStreamReader;

public class S1 {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        int swifts[] = new int[n];
        int semaphores[] = new int[n];

        // Getting scores
        List<Integer> tokens_swifts = getTokens(reader.readLine());
        List<Integer> tokens_semaphores = getTokens(reader.readLine());

        reader.close();

        // Populating arrays with tokens
        for (int i = 0; i < n; i++) {
            swifts[i] = tokens_swifts.get(i);
            semaphores[i] = tokens_semaphores.get(i);
        }

        int days = 0;
        int total_swifts = 0;
        int total_semaphores = 0;

        for (int i = 0; i < n; i++) {
            total_swifts += swifts[i];
            total_semaphores += semaphores[i];

            if (total_swifts == total_semaphores) {
                days = i + 1;
            }

        }

        System.out.println(days);

    }

    // Helper to get input
    private static List<Integer> getTokens(String str) {
        StringTokenizer tokenizer = new StringTokenizer(str, " ");
        List<Integer> tokens = new ArrayList<Integer>();
        while (tokenizer.hasMoreElements()) {
            tokens.add(Integer.parseInt(tokenizer.nextToken()));
        }
        return tokens;
    }

}
