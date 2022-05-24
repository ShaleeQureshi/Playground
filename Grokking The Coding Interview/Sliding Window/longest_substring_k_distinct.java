
public class longest_substring_k_distinct {
    public static int findLength(String str, int k) {

        int maxlen = 0;
        int pos = 0;
        int distinct = 0;
        int currentlen = 0;
        int strlen = str.length();
        int dictionary[] = new int[256];

        for (int i = 0; i < strlen; i++) {

            int ascii = str.charAt(i);
            if (dictionary[ascii] == 0) {
                distinct += 1;
            }
            dictionary[ascii] += 1;
            if (distinct > k) {
                if (maxlen < currentlen) {
                    maxlen = currentlen;
                }
                int pos_ascii = str.charAt(pos);
                dictionary[pos_ascii] -= 1;
                System.out.println(str.charAt(pos));
                System.out.println(dictionary[pos_ascii]);
                currentlen -= 1;
                if (dictionary[pos_ascii] == 0) {
                    distinct -= 1;
                }
                pos += 1;
            }
            currentlen += 1;

        }

        return maxlen;

    }

    public static void main(String[] args) {
        int val = findLength("araaci", 2);
        if (val == 4) {
            System.out.println("correct");
        } else {
            System.out.println("incorrect");
            System.out.println("value given is: " + val);
        }
    }
}
