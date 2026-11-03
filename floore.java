package BinarySearch;

public class floore {

    static int findFloor(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int floor = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Possible floor mila
            if (nums[mid] <= target) {
                floor = nums[mid];

                // Hume largest chahiye,
                // isliye RIGHT me aur search karo
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return floor;
    }

    public static void main(String[] args) {

        int[] nums = {2, 4, 6, 8, 10};
        int target = 7;

        System.out.println("Floor: " + findFloor(nums, target));
    }
}
