// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.lang.*;
class armstrong{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        int sum=0,count=0;
        int n1=num;
        int n2=num;
        int ans;
        while(num>0)
        {
            int rem=num%10;
            count++;
            num/=10;
        }
        System.out.println("length:"+count);
        while(n1>0)
        {
            int last=n1%10;
            ans=(int)Math.pow(last,count);
            sum=sum+ans;
            n1/=10;
        }
        System.out.println("result:"+sum);
        if(sum==n2)
        {
            System.out.println("the number is an armstrong number");
        }
        else
        {
            System.out.println("the number is not an armstrong number");
        }
    }
}