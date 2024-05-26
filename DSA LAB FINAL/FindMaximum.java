public class FindMaximum {
   
    public static int findMax(int[] nums) {
 
        if (nums == null || nums.length == 0) {
            System.out.println("Array is empty");
        }

        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5,};
        System.out.println("The maximum is: " + findMax(nums));
    }
}
