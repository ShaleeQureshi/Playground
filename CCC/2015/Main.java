import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(reader.readLine());
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < k; i++) {
            int number = Integer.parseInt(reader.readLine());
            if (number == 0) {
                list.remove(list.size() - 1);
            } else {
                list.add(number);
            }
        }
        System.out.println((int) list.stream().mapToDouble(a -> a).sum());

    }
}