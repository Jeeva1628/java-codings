import java.util.*;
import java.util.Arrays;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size  of row and col:");
        int row = sc.nextInt();
        int col= sc.nextInt();
        int temp1=0,temp2=0;
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
                if(i==j &&  a[i][j]!=1 )
                {
                        temp1++;
                }
                    if(i!=j && a[i][j]!=0)
                    {
                        temp2++;
                    }
                
                }
            }
            if(temp1>0 && temp2>0)
            {
                System.out.println("the matrix is an not identity matrix");
            }
            else
            {
             System.out.println("the matrix is an identity matrix");   
            }
     }
}
