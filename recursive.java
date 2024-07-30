// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Sample {
    public void reverse(int num)
    {
        if(num>10)
        {
            System.out.print(num%10);
            reverse(num/10);
        }
        else
        {
        System.out.print(num);
    }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Sample s=new Sample();
        System.out.println("enter a number to be reversed:");
        int n=sc.nextInt();
        s.reverse(n);
    }
}