package Arrays;

public class RightRotate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        int n = arr.length;

        // Handle if k > n
        k = k % n;

        int[] temp = new int[k];

        // Step 1: Store last k elements in temp
        for (int i = 0; i < k; i++) {
            temp[i] = arr[n - k + i];
        }

        // Step 2: Shift remaining elements right
        for (int i = n - k - 1; i >= 0; i--) {
            arr[i + k] = arr[i];
        }

        // Step 3: Put back temp elements
        for (int i = 0; i < k; i++) {
            arr[i] = temp[i];
        }

        // Print rotated array
        System.out.println("After Right Rotation by " + k + " steps:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
