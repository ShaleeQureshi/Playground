
import java.util.*;

/**
 * Date: Dec 2020
 * 
 * @author Hussain Description: J2: Epidemiology
 */

public class Main {

    public static void main(String[] args) {

        // prepare keyboard for scanner input
        Scanner input = new Scanner(System.in);

        // declare variables for input and store input into variables
        int limit = input.nextInt();
        int infected = input.nextInt();
        int infectRate = input.nextInt();

        input.close(); // Closing the Scanner Object

        // day counter variable to keep track of days
        int dayCounter = 0;
        double total = infected; // Using a double since we will be working with exponents and powers

        // Checking to see if the limit has already been reached
        if (total == limit) {
            System.out.println(1); // Outputting 1 then since it has been 1 day
        }
        // If the limit has not been reached then the following will occur
        else {
            // Looping through as long as the limit has not been reached
            while (total <= limit) {
                dayCounter++; // Adding 1 to the dayCounter since an additional day has passed

                // Calculating the total
                // The total increases each day based on the rate multiplied by the initial
                // amount and adding in the previous value
                total = total + (Math.pow(infectRate, dayCounter) * infected);
            }
            System.out.println(dayCounter); // Outputting the dayCounter
        }

    }

}
