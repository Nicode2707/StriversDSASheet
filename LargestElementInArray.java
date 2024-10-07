public class LargestElementInArray {

    public static int greatestnum(int arr[]) {
        int greatest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > greatest) {
                greatest = arr[i];
            }
        }
        return greatest;
    }

    public static void main(String[] args) {
        int arr[] = {12, 47, 78, 97, 105};
        System.out.println(greatestnum(arr));
    }
}
