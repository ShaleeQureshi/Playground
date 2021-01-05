import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class S2 {

    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> chars = new ArrayList<>();
        ArrayList<String> vals = new ArrayList<>();

        int num = Integer.parseInt(input.readLine());

        for (int i = 0; i < num; i++) {
            String elements[] = input.readLine().split(" ");
            chars.add(elements[0]);
            vals.add(elements[1]);
        }

        String binaryCode = input.readLine();
        String compare = "";
        String output = "";
        for (int i = 0; i < binaryCode.length() + 1; i++) {
            if (vals.contains(compare)) {
                output += chars.get(vals.indexOf(compare));
                compare = "";
            }
            try {
                compare += binaryCode.charAt(i);
            } catch (Exception e) {
                break;
            }
        }
        System.out.println(output);

    }

}
