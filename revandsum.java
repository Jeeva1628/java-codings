import java.util.Scanner;
import java.util.Arrays;

class add
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int a[]=new int[n1];
        int b[]=new int[n2];
        int var1=0;
        int var2=0;
        System.out.println("enter array1:");
        for(int i=0;i<n1;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter array2:");
        for(int i=0;i<n2;i++)
        {
            b[i]=sc.nextInt();
        }
        for(int i=n1-1;i>=0;i--)
        {
            var1=var1*10+a[i];
        }
        for(int i=n2-1;i>=0;i--)
        {
            var2=var2*10+b[i];
        }
        var1=var1+var2;
        int temp=var1;
        int count=0;
        while(var1>0)
        {
            count++;
            var1/=10;
        }
        int ans[]=new int[count];
        for(int i=0;i<count;i++)
        {
            ans[i]=temp%10;
            temp/=10;
        }
         System.out.println("sum of two arrays:");
        for(int i=0;i<count;i++)
        {
        System.out.print(ans[i]);
        }   
    }
}
