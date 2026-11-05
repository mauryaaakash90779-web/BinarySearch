
public class leet34 {

    /*
     * LeetCode 34
     * Find First and Last Position of Element
     * in Sorted Array
     */

    static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};

        int start = 0;
        int end = nums.length - 1;


        // -------------------------
        // Find FIRST occurrence
        // -------------------------

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {

                // Possible first position
                ans[0] = mid;

                // First occurrence chahiye,
                // isliye LEFT me aur search karo
                end = mid - 1;
            }

            else if (nums[mid] > target) {
                end = mid - 1;
            }

            else {
                start = mid + 1;
            }
        }


        // Binary Search ko reset karo
        start = 0;
        end = nums.length - 1;


        // -------------------------
        // Find LAST occurrence
        // -------------------------

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {

                // Possible last position
                ans[1] = mid;

                // Last occurrence chahiye,
                // isliye RIGHT me aur search karo
                start = mid + 1;
            }

            else if (nums[mid] > target) {
                end = mid - 1;
            }

            else {
                start = mid + 1;
            }
        }

        return ans;
    }


    public static void main(String[] args) {

        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] ans = searchRange(nums, target);

        System.out.println("First Position: " + ans[0]);
        System.out.println("Last Position: " + ans[1]);
    }
}
