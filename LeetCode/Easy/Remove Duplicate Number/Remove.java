public class Remove {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        } else {
            int j = 0;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[j]) {
                    j++;
                    nums[j] = nums[i];
                }
            }
            return j + 1;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[] { 1, 2, 2, 3 };
        int length = removeDuplicates(array);
        System.out.println(length);
    }
}