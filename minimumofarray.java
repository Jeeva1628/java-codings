import java.util.*;
import java.util.Arrays;

class minimum {
    public int min(int arr[])
    {
        int temp=arr[0]; 
        for(int i=1;i<arr.length;i++)
        {
                if(temp>arr[i])
                {
                    temp=arr[i];
                }
            }
            return temp;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        minimum m=new minimum();
        int a[]=new int[5];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.print("minimum number is:"+m.min(a));
        
    }
}
