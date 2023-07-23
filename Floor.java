public class Floor {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 5, 6, 7, 10, 40, 100 };
        System.out.print(FloorFinder(arr, 99));
    }

    static int FloorFinder(int[] array, int num) {
        int start = 0;
        int end = array.length;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] == num) {
                return array[mid];

            } else if (num < array[mid]) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }
        }

        return array[end];

    }
}
