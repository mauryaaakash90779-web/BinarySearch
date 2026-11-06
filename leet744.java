
public class leet744 {

    /*
     * LeetCode 744
     * Find Smallest Letter Greater Than Target
     *
     * Ye Ceiling concept jaisa hai.
     *
     * Normal Ceil:
     * smallest element >= target
     *
     * Is question me:
     * smallest character > target
     */

    static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        // Agar target se greater koi character nahi mila,
        // to question ke according first character return hoga.
        char ans = letters[0];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (letters[mid] > target) {

                ans = letters[mid];

                // Greater character mil gaya,
                // ab aur SMALL character dhundo.
                // Isliye LEFT jao.
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        char[] letters = {'c', 'f', 'j'};
        char target = 'c';

        System.out.println("Answer: " +
                           nextGreatestLetter(letters, target));
    }
}