import java.util.*;
class array2d {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j;
        System.out.println("enter rows and col");
        int row=sc.nextInt();
        int col=sc.nextInt();
        System.out.println("enter the array elements:");
        int a[][]=new int[row][col];
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
               
                a[i][j]=sc.nextInt();
               
            }
        }
        System.out.println("the entered array is:");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
