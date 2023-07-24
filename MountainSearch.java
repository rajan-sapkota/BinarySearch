public class MountainSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 5, 7, 8, 10, 24, 26, 55, 52, 44, 41, 33, 31, 27, 26, 25, 23, 22, 21, 17, 4, 3 };
        int[] arr2 = { 1 };
        System.out.println(search(arr, 26));
        System.out.println(search(arr, 8));
        System.out.println(search(arr, 10));
        System.out.println(search(arr, 24));
        System.out.println(search(arr, 55));
        System.out.println(search(arr, 52));
        System.out.println(search(arr, 44));
        System.out.println(search(arr, 41));
        System.out.println(search(arr, 33));
        System.out.println(search(arr, 31));
        System.out.println(search(arr, 27));
        System.out.println(search(arr, 25));
        System.out.println(search(arr, 23));
        System.out.println(search(arr, 21));
        System.out.println(search(arr, 17));
        System.out.println(search(arr, 4));
        System.out.println(search(arr, 3));
        System.out.println(search(arr, 77));

    }

    static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid + 1] > nums[mid]) {
                ans = mid + 1;
                start = mid + 1;
            } else {
                ans = mid;
                end = mid - 1;
            }
        }

        int index = binarySearch(nums, target, ans, true);
        int index2 = binarySearch(nums, target, ans, false);
        if (index != -1) {
            return index;
        } else
            return index2;

    }

    static int binarySearch(int[] nums, int target, int ans, boolean isAsc) {
        int start = 0;
        int end = 0;
        if (isAsc) {
            start = 0;
            end = ans;
        } else {
            start = ans + 1;
            end = nums.length - 1;
        }
        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                if (isAsc) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (isAsc) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

}
