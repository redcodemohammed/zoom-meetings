public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int start = 0;
        int end = numbers.length - 1;
        int target = 0;

        while (true) {
            int mid = start + ((end - start) / 2);

            // check if we are done
            if (start > end) {
                System.out.printf("The element %s was not found\n", target);
                break;
            } else if (numbers[mid] == target) {
                System.out.printf("The element %s was found in the index %s", target, mid);
                break;
            }

            // find the next sub array
            if (target > numbers[mid]) {
                start = mid + 1;
            } else if (target < numbers[mid]) {
                end = mid - 1;
            }
        }
    }
}
