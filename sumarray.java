
import java.util.*;
class array2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j,k,l;
        System.out.println("enter rows and col");
        int row=sc.nextInt();
        int col=sc.nextInt();
        System.out.println("enter the array1 elements:");
        int a[][]=new int[row][col];
        int b[][]=new int[row][col];
        int sum[][]=new int[row][col];
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
               
                a[i][j]=sc.nextInt();
               
            }
        }
         System.out.println("enter the array2 elements:");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("The sum is:");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                sum[i][j]=a[i][j]+b[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}
