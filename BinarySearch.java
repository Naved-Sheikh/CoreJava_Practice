public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10, 12, 14};
        int target = 10;
        int result = binarySearch(numbers, target);
        System.out.println("Index: " + result);
    }
}
