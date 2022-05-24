import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.io.InputStreamReader;

public class Main {
    private HashSet<String> list;
    private int count = 0;

    public Main(HashSet<String> list) {
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

        this.list.stream().forEach(i -> {
            if (hay.contains(i)) {
                this.count++;
            }
        });

        return this.count;
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
        Main main = new Main(list);
        main.printPermutations(needle.toCharArray(), 0);
        System.out.println(main.getCount(hay));
    }

}