import java.util.*;
import java.util.Arrays;

class duplicate {
    public void dupe(int a[])
    {

        int temp,i,j,count=0;
        for( i=0;i<a.length;i++)
        {
            for( j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.print(a[0]+" ");
        for(int x=0;x<a.length-1;x++)
        {
                if(a[x]!=a[x+1])
             {
            System.out.print(a[x+1]+" ");
        }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        duplicate d=new duplicate();
        System.out.println("enter the array values");
        int arr[]=new int[6];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        d.dupe(arr);
    }
}
