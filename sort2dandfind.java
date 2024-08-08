import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        
        System.out.println("enter elements");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int b[]=new int[n*n];
        int index=0;
        for(int ar[]:a)
        {
            for(int z:ar)
            {
                b[index++]=z;
            }
        }
        for(int i=0;i<(n*n);i++)
        {
            for(int j=i+1;j<(n*n);j++)
            {
            int temp=0;
            if(b[i]>b[j])
            {
                temp=b[i];
                b[i]=b[j];
                b[j]=temp;
            }
            }
        }
        
        System.out.println("-------------");
        index=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=b[index++];
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("enter index");
        int k=sc.nextInt();
        a:
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                k--;
                if(k==0){
                    System.out.println("the element is:"+a[i][j]);
                    break a;
                }
            }
        }
    }
}
