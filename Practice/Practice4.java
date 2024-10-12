package Practice;

public class Practice4 {
    public static int sumUntilSmaller(int[] arr) {
        if (arr.length == 0) return 0;

        int sum = arr[0];  // Initialize sum with the first element

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= arr[i - 1]) {
                sum += arr[i];
            } else {
                break;  // Stop when a smaller element is found
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 4, 6};
        System.out.println("Sum until smaller term: " + sumUntilSmaller(arr));
    }
}
