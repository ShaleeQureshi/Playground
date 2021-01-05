import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashSet;

import java.io.InputStreamReader;

public class S3 {

    private HashSet<String> list;

    public S3(HashSet<String> list) {
        this.list = list;
    }

    public void printPermutations(char[] string, int currentIndex) {

        if (currentIndex == string.length - 1) {
            this.list.add(new String(string));
            return;
        }

        for (int i = currentIndex; i < string.length; i++) {
            if (string[i] != string[currentIndex] || i == currentIndex) {
                swap(string, i, currentIndex);
                printPermutations(string, currentIndex + 1);
                swap(string, i, currentIndex);
            }
        }

    }

    public int getCount(String hay) {

        int count = 0;

        for (String string : this.list) {
            if (hay.contains(string)) {
                count++;
            }
        }
        return count;
    }

    private void swap(char[] string, int i, int end) {
        char temp = string[i];
        string[i] = string[end];
        string[end] = temp;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String needle = reader.readLine();
        String hay = reader.readLine();
        HashSet<String> list = new HashSet<String>();
        S3 main = new S3(list);
        main.printPermutations(needle.toCharArray(), 0);
        System.out.println(main.getCount(hay));
    }

}