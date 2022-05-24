import java.util.Scanner;

public class J1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        s.close();

        int right_hand = n;
        int left_hand = 0;

        while (right_hand > 5) {
            --right_hand;
            ++left_hand;
        }

        int counter = 0;

        while (right_hand <= 5 && left_hand <= 5 && right_hand >= left_hand) {
            ++counter;
            --right_hand;
            ++left_hand;
        }

        System.out.println(counter);

    }

}