import java.util.*;
import java.util.Arrays;

class shifting {
    public void shift(int arr[],int n)
    {
        while(n>0)
        {
            int i;
        int first=arr[0];
        for(i=1;i<arr.length;i++)
            arr[i-1]=arr[i];
        arr[i-1]=first;
        n--;
        }
        System.out.println("after shift");
        for(int x:arr)
            System.out.print(x+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        shifting s=new shifting();
        System.out.println("enter the array values");
        int a[]=new int[5];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter the number of shifts:");
        int num=sc.nextInt();
        s.shift(a,num);
    }
}
