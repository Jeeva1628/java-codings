import java.util.*;
import java.util.Arrays;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size  of rows1: and cols1:");
        int row1 = sc.nextInt();
        int col1= sc.nextInt();
        System.out.println("enter the size  of rows2: and cols2:");
        int row2= sc.nextInt();
        int col2= sc.nextInt();
        int mul[][] = new int[row1][col2];
        int a1[][]= new int[row1][col1];
        int a2[][]= new int[row2][col2];
        
        System.out.println("enter the elements of matrix1:");
        
        for(int i=0;i<row1;i++){
            for(int j=0;j<col1;j++){
                a1[i][j]=sc.nextInt();
            }
        }
        System.out.println("the elements of array1:");
        for(int i=0;i<row1;i++)
        {
            for(int j=0;j<col1;j++)
            {
                System.out.print(a1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("enter the elements of matrix2:");
        
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                a2[i][j]=sc.nextInt();
            }
        }
        System.out.println("the elements of array2:");
        for(int i=0;i<row2;i++)
        {
            for(int j=0;j<col2;j++)
            {
                System.out.print(a2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("the mul of two arrays");
        for(int i=0; i<row1;i++){
            for(int j=0;j<col2;j++){
                mul[i][j]=0;
                for(int k=0;k<col1;k++){
                mul[i][j]+=a1[i][k]*a2[k][j];
            }
        }
        }
         for(int i=0; i<row1;i++){
            for(int j=0;j<col2;j++){
                System.out.print(mul[i][j]+" ");
            }
            System.out.println();
         }
     }
}
