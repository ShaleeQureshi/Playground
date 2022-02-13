import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;
import java.io.InputStreamReader;

public class S3 {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        int data[] = new int[1000];

        for (int i = 0; i < n; i++) {
            ++data[Integer.parseInt(reader.readLine()) - 1];
        }
        reader.close();

        ArrayList<Integer> highest = new ArrayList<Integer>();
        ArrayList<Integer> second_highest = new ArrayList<Integer>();

        int highest_freq = 0;
        int second_highest_freq = 0;

        for (int i = 0; i < 1000; i++) {
            if (data[i] != 0) {

                if (data[i] > highest_freq) {
                    second_highest_freq = highest_freq;
                    highest_freq = data[i];
                    second_highest.clear();
                    second_highest.addAll(highest); // Add all data from highest list to this list
                    highest.clear();
                    highest.add(i);
                }

                else if (data[i] == highest_freq) {
                    highest.add(i);
                }

                else if (data[i] > second_highest_freq) {
                    second_highest_freq = data[i];
                    second_highest.clear();
                    second_highest.add(i);
                } else if (data[i] == second_highest_freq) {
                    second_highest.add(i);
                }

            }
        }

        if (highest.size() > 1) {
            Collections.sort(highest);
            System.out.println((int) Math.abs(highest.get(0) - highest.get(highest.size() - 1)));
        } else {
            Collections.sort(highest);
            Collections.sort(second_highest);
            System.out.println(Math.max(Math.abs(highest.get(highest.size() - 1) - second_highest.get(0)),
                    Math.abs(highest.get(0) - second_highest.get(second_highest.size() - 1))));
        }

    }

}
