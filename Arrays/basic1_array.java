public class basic1_array {
    public static void main(String[] args) {
        int sum=0;
        int[] a={1,2,3,4,5,6};
        for(int i=0;i<a.length;i++){
            sum += a[i];
            System.out.println(a[i]);
        }
        System.out.println("sum of all elements in array is : "+sum);
    }    
}