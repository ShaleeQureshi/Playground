import java.io.*;
import java.util.*;


public class CookieJars {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n, c, q;
        
        String line = reader.readLine();

        String array[] = line.split(" ");
        n = Integer.parseInt(array[0]);
        c = Integer.parseInt(array[1]);
        q = Integer.parseInt(array[2]); 

        int total = n * c;

        int nVals[] = new int[q];

        for (int i = 0; i < nVals.length; i++) {
            nVals[i] = Integer.parseInt(reader.readLine());
        }

        int jars[] = new int[n];
        for (int i = 0; i < jars.length; i++) {
            jars[i] = c;
        }

        for (int i = 0; i < nVals.length; i++) {
            for (int j = 0; j < jars.length; j++) {
                if ()
            }
        }
        System.out.println(total);


    }

}
