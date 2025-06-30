import java.util.*;
public class addmatrix_2D_array {
    public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the n.o of rows and columns");
    int rows=sc.nextInt();
    int cols=sc.nextInt();
    int[][] result=new int[rows][cols];
    int[][] matrix1=new int[rows][cols];
    int[][] matrix2=new int[rows][cols];
    System.out.println("enter elements for first matrix 1");
    for(int i=0;i<matrix1.length;i++){
        for(int j=0;j<matrix1.length;j++){
            matrix1[i][j]=sc.nextInt();
        }
    }
    System.out.println("enter elements for first matrix 2");
    for(int i=0;i<matrix2.length;i++){
        for(int j=0;j<matrix2.length;j++){
            matrix2[i][j]=sc.nextInt();
        }
    }

    for(int i=0;i<result.length;i++){
        for(int j=0;j<result.length;j++){
            result[i][j]=matrix1[i][j] + matrix2[i][j];
        }
    }
    System.out.println("addition of the 2 matrix are");
    for(int i=0;i<result.length;i++){
        for(int j=0;j<result.length;j++){
            System.out.print(result[i][j]+" ");
        }
        System.out.println();
    }
}
}
