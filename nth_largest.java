import java.util.*;
import java.util.Arrays;

class largest {
    public int lar(int arr[],int n)
    {
        int temp,res,i,j; 
        int len=arr.length;
        System.out.println("the sorted array is:");
        for( i=0;i<len;i++)
        {
            for( j=i+1;j<len;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
            res=arr[len-n];
            return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        largest l=new largest();
        System.out.println("enter the array values");
        int a[]=new int[5];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter the position:");
        int num=sc.nextInt();
        System.out.print("3rd largest number is:"+l.lar(a,num));
    }
}
