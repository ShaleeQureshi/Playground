public class maximum_subarray_size_k {

    public static int findMaxSumSubArray(int k, int[] arr) {
        // TODO: Write your code here
        int index = 0;
        int current_sum = 0;
        int max_sum = 0;
        for (int i = 0; i < arr.length; i++) {
            current_sum += arr[i];
            if (i >= k - 1) {
                if (current_sum > max_sum) {
                    max_sum = current_sum;
                }
                index += 1;
                current_sum -= arr[index - 1];
            }
        }

        return max_sum;
    }

    public static void main(String[] args) {
        int array[] = new int[] { 2, 3, 4, 1, 5 };
        int val = findMaxSumSubArray(2, array);
        if (val == 7) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
            System.out.println("Value is: " + val);
        }

    }

}