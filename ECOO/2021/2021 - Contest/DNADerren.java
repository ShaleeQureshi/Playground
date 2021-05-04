import java.io.*;

public class DNADerren {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String line = reader.readLine();
        char array[] = line.toCharArray();
        String newLine = "";

        for (int i = 0; i < line.length() - 1; i++) {
            newLine = newLine + array[i];
            if (array[i] == 'A' && array[i + 1] == 'A' || (array[i] != 'A' && array[i + 1] != 'A')) {
                newLine = newLine + " ";
            }
        }

        System.out.println(newLine + line.charAt(line.length() - 1));

    }

}
