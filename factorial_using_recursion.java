import java.util.*;
class Factorial {
    public int fact(int num)
    {
        if(num>0)
            return  num*fact(num-1);
        return 1;
}
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Factorial fc=new Factorial();
        System.out.println("enter a number:");
        int n=sc.nextInt();
       System.out.println(fc.fact(n));
    }
}
