import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S4 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String n = reader.readLine();

        byte[] array = n.getBytes();

        int counter = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1] && j < array.length - 2) {
                    byte temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    counter = i / 2;
                }
            }
        }

        System.out.println(counter);

    }
}
