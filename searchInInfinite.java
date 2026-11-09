public class InfiniteArraySearch {

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 7, 9, 10, 12, 15, 18, 21, 25, 30, 35, 40, 50};

        int target = 21;

        int ans = findRange(arr, target);

        System.out.println(ans);
    }

    static int findRange(int[] arr, int target) {

        // Starting window
        int start = 0;
        int end = 1;

        // Jab tak target current window ke bahar hai
        while (target > arr[end]) {

            int newStart = end + 1;

            // Window ka size double kar rahe hain
            end = end + (end - start + 1) * 2;

            start = newStart;
        }

        // Range mil gayi, ab binary search
        return binarySearch(arr, target, start, end);
    }


    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            }

            else if (target > arr[mid]) {
                start = mid + 1;
            }

            else {
                return mid;
            }
        }

        return -1;
    }
}