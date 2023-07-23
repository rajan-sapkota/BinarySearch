class BinarySearch {
    public static void main(String[] args) {
        int[] num = { 2, 4, 5, 12, 15, 18, 19, 20, 34, 45 };
        System.out.println(binarySearch(num, 34));
    }

    static int binarySearch(int[] list, int target) {
        int index = -1;
        int start = 0;
        int end = list.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == list[mid]) {
                index = mid;
                return mid;
            } else if (target > list[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return index;
    }
}