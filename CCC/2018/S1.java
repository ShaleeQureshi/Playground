import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class S1 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());
        double positions[] = new double[number];

        for (int i = 0; i < positions.length; i++) {
            positions[i] = Integer.parseInt(reader.readLine());
        }

        Arrays.sort(positions);

        double size = Integer.MAX_VALUE;
        double currentSize;

        for (int i = 1; i < positions.length - 1; i++) {
            currentSize = (((positions[i] - positions[i - 1]) / 2) + ((positions[i + 1] - positions[i]) / 2));
            if (currentSize < size) {
                size = currentSize;
            }
        }
        System.out.println(String.format("%.1f", size));

    }
}