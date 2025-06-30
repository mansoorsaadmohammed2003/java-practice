import java.util.*;

public class odd_or_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int odd=0,even=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 == 0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("even is :"+even+" and odd is : "+odd);

        sc.close(); // Good practice to close the scanner
    }
}