import java.util.*;


public class HighFiver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (n % 2 == 0 && n % 3 == 0 && String.valueOf(n).charAt(String.valueOf(n).length()-1) != '2') {
            System.out.println("not a memer");
        }
        else {
            System.out.println("memer");
        }

        input.close();
    }
}
