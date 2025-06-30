import java.util.*;

public class reverse_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array in reverse order:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

        sc.close(); // Good practice to close the scanner
    }
}