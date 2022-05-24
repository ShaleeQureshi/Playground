import java.util.*;

public class TootsieRolls {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if (n > 7) {
            System.out.println("Tootsie Roll!");
        }
        else if (n < 3){
            System.out.println("Rocket!");
        }
        else {
            System.out.println("NO");
        }
        input.close();
    }
}