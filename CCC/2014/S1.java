import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class S1 {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(reader.readLine());
        int numRounds = Integer.parseInt(reader.readLine());

        int roundsRemoval[] = new int[numRounds];

        for (int i = 0; i < roundsRemoval.length; i++) {
            roundsRemoval[i] = Integer.parseInt(reader.readLine());
        }

        ArrayList<Integer> friends = new ArrayList<Integer>();

        for (int i = 0; i < number; i++) {
            friends.add(i + 1);
        }

        for (int i = 0; i < numRounds; i++) {
            ArrayList<Integer> removalList = new ArrayList<Integer>();
            for (int j = 0; j < friends.size(); j++) {
                if ((j + 1) % roundsRemoval[i] == 0) {
                    removalList.add(friends.get(j));
                }
            }
            friends.removeAll(removalList);
        }

        for (Integer integer : friends) {
            System.out.println(integer);
        }

    }
}