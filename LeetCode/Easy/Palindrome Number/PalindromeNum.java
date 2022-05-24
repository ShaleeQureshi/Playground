public class PalindromeNum {

    public static boolean isPalindrome(int x) {

        String newX = Integer.toString(x);
        char[] array = newX.toCharArray();
        String newNum = "";

        for (int i = array.length - 1; i >= 0; i--) {
            newNum = newNum + array[i];
        }
        return newNum.equals(newX);

    }

    public static void main(String[] args) {
        boolean is = isPalindrome(1221);
        System.out.println(is);
    }
}