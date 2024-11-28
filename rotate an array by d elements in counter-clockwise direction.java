
class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        int n = arr.length; 
        if (n == 0) return;

        // Handle cases where d > n
        d = d % n;

        if (d == 0) return;

        // Step 1: Store the first 'd' elements in a temporary array
        int[] temp = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        // Step 2: Shift the remaining elements to the left
        for (int i = 0; i < n - d; i++) {
            arr[i] = arr[i + d];
        }

        // Step 3: Place the stored elements at the end
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
    }
}
