import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

import java.io.InputStreamReader;

public class S3 {

    private ArrayList<String> list;
    private int count = -1;
    private String needle;
    private String hay;

    public S3(ArrayList<String> list, String needle, String hay) {
        this.list = list;
        this.needle = needle;
        this.hay = hay;
        this.printPermutations(this.needle.toCharArray(), 0);
    }

    private void printPermutations(char[] string, int currentIndex) {

        if (currentIndex == string.length - 1) {
            this.list.add(new String(string));
            this.updateCount();
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

    private void updateCount() {

        for (int i = 0; i < this.list.size(); i++) {
            if (this.hay.contains(this.list.get(i))) {
                this.count++;
            }
        }
    }

    private void swap(char[] string, int i, int end) {
        char temp = string[i];
        string[i] = string[end];
        string[end] = temp;
    }

    public int getCount() {
        return this.count;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String needle = reader.readLine();
        String hay = reader.readLine();
        S3 main = new S3(new ArrayList<String>(), needle, hay);
        System.out.println(main.getCount());
    }

}