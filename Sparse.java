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
        int count=0;
        System.out.println("enter the elements:");
        int sum=(row*col)/2;
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
                if(a[i][j]==0)
                    count++;
            }
        }
        if(count>sum)
                System.out.println("It is a Sparse matrix");
        else
                System.out.println("It is not a Sparse matrix");
        
     }
}
