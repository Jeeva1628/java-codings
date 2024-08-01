import java.util.*;
import java.util.Arrays;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size  of row and col:");
        int row = sc.nextInt();
        int col= sc.nextInt();
        int temp[][]=new int[row][col];
        int a[][]= new int[row][col];
        
        System.out.println("enter the elements:");
        
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0; i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                temp[j][i]=a[i][j];
            }
        }
        System.out.println("after transpose:");
        for(int i=0; i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(temp[i][j]+" ");
            }
            System.out.println();
        }
     }
}
