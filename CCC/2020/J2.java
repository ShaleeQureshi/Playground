
import java.util.*;

/**
 * Date: Dec 2020
 * @author Hussain
 *	Description: J2: Epidemiology
 */

public class J2 {

	public static void main(String[] args) {

		// prepare keyboard for scanner input
 		Scanner input = new Scanner (System.in);
		
		// declare variables for input and store input into variables
		int limit = input.nextInt();
		int infected = input.nextInt();
		int infectRate = input.nextInt();

		input.close();
		
		// day counter variable to keep track of days 
		int dayCounter = 0; 
		
		for (int i = 0; i < limit; i = i + (int) Math.pow(infectRate, dayCounter) * infected) {
			dayCounter++;
		}
       System.out.println(dayCounter);
		
		
	}

}
