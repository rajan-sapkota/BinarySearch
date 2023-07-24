public class PeakTree {
    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3, 1 };
        int[] arr2 = { 1, 2, 55, 66, 88, 54, 32, 11 };
        System.out.println(peak(arr2));

    }

    static int peak(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        if (nums.length == 1) {
            return nums[0];
        }
        while (start <= end) {
            if (start == nums.length - 1) {
                return start;
            }
            int mid = (start + end) / 2;
            if (nums[mid + 1] > nums[mid]) {
                ans = nums[mid + 1];
                start = mid + 1;
            } else {
                ans = nums[mid];
                end = mid - 1;
            }
        }
        return ans;
    }

}
