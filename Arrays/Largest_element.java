import java.util.*;
public class Largest_element {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the array ekements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max_elem=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > max_elem){
                max_elem = arr[i];
            }
        }
        System.out.println(max_elem);
        
    }
}
