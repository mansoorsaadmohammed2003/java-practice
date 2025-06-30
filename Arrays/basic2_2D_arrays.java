public class basic2_2D_arrays {
    public static void main(String[] args) {//print DIAGNOLY 
        int[][] arr= {{1,2,3},//0,2=3
                     {4,5,6},//1,1=5
                     {7,8,9,}};//2,0=7

        for(int i=0;i<arr.length;i++){ //if i is 0            
                System.out.print(arr[i][arr.length-1-i]+" ");
        }
    }
}
 