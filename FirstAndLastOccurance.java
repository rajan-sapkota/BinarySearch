public class FirstAndLastOccurance {
    public static void main(String[] args) {
        int[] num1 = { 2, 4, 5, 5, 5, 5, 5, 18, 18, 20, 34, 45 };
        int[] num2 = {};
        int[] searcher = binarySearch(num1, 5);
        System.out.println(searcher[0] + " " + searcher[1]);
    }

    static int[] binarySearch(int[] nums, int target) {
        int[] ans = { -1, -1 };
        int startVal = SearchAgain(nums, target, true);
        int endVal = SearchAgain(nums, target, false);
        ans[0] = startVal;
        ans[1] = endVal;
        return ans;
    }

    static int SearchAgain(int[] nums, int target, boolean searchStart) {
        int start = 0;
        int asnAt = -1;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                asnAt = mid;
                if (searchStart) {

                    end = mid - 1;

                } else {
                    start = mid + 1;
                }
            }

        }
        return asnAt;
    }
}