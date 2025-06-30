public class basic1_2D_arrays {
    public static void main(String[] args) {
        int[][] arr= {{1,2,3},
                     {4,5,6},
                     {7,8,9,}};

        for(int i=0;i<arr.length;i++){ //if i is 0
            for(int j=0;j<arr.length;j++){//j=0 then 1 is printed , then j=1 so arr[1][1] is 5 then arr[2][2] is 9
                System.out.print(arr[j][j]+" ");
            }
            System.out.println();
        }
    }
}
 