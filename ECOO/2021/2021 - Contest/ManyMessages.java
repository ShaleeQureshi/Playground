import java.util.*;
import java.io.*;

public class ManyMessages {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int minStart = Integer.parseInt(reader.readLine());
        int interval = Integer.parseInt(reader.readLine());
        int msgSent = Integer.parseInt(reader.readLine());

        int counter = 0;
        int idk = (minStart + interval);
        while (counter < 3) {
            if (msgSent <= idk) {
                System.out.println(idk);
                break;
            }
            idk += interval;
            counter++;
        }
        if (counter == 3) {
            System.out.println("Who knows...");
        }

    }
}