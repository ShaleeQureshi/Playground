import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int numLines = Integer.parseInt(reader.readLine());
        int[] num = new int[numLines];

        for (int i = 0; i < numLines; i++) {
            num[i] = Integer.parseInt(reader.readLine());
        }
        reader.close();
        int dub = 0;
        for (int i = 0; i < numLines; i++) {
            dub = num[i] * 2;
            for (int j = 2; j < dub; j++) {
                if (isPrime(j) && isPrime(dub - j)) {
                    System.out.println(j + " " + (dub - j));
                    break;
                }
            }
        }

    }

    private static boolean isPrime(int n) {
        int max = (int) Math.sqrt(n);
        for (int i = 2; i <= max; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
