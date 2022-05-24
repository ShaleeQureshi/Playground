public class smallest_subarray_with_given_size {

    public static int findMinSubArray(int S, int[] arr) {
        // TODO: Write your code here

        int min_size = Integer.MAX_VALUE;
        int current_size = 0;
        int current_sum = 0;
        int pos = 0;

        for (int i = 0; i < arr.length; i++) {
            current_sum += arr[i];
            current_size += 1;
            if (current_sum > S) {
                current_sum -= arr[pos];
                current_size -= 1;
                pos += 1;
            }
            if (current_sum >= S) {
                if (current_size < min_size) {
                    min_size = current_size;
                }
                current_sum -= arr[pos];
                current_size -= 1;
                pos += 1;
            }
        }

        return min_size;

    }

    public static void main(String[] args) {

        int array[] = new int[] { 2, 1, 5, 2, 3, 2 };
        int S = 7;
        int val = findMinSubArray(S, array);

        if (val == 2) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
            System.out.println("The given value is: " + val);
        }

    }

}
