package BinarySearch;

public class ceiling {

    static int findCeil(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int ceil = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Possible ceil mila
            if (nums[mid] >= target) {
                ceil = nums[mid];

                // Hume smallest chahiye,
                // isliye LEFT me aur search karo
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return ceil;
    }

    public static void main(String[] args) {

        int[] nums = {2, 4, 6, 8, 10};
        int target = 7;

        System.out.println("Ceiling: " + findCeil(nums, target));
    }
}