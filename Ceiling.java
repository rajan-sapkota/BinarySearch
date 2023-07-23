public class Ceiling {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 5, 6, 7, 10, 40, 100 };
        System.out.print(CeilingFinder(arr, 10));
    }

    static int CeilingFinder(int[] array, int num) {
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

        return array[end + 1];

    }
}
