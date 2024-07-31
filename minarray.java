// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.util.Arrays;

class min {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={5,3,1,2,4};
        int temp,i,j;
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
        System.out.print("minimum number is:"+a[0]);
        
    }
}
