import java.util.*;
class Sum {
    public int add(int num)
    {
        if(num>0)
        {
           
            return  num%10+add(num/10);
        }
        else
        {
       return 0;
        }
}
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Sum s=new Sum();
        System.out.println("enter a number:");
        int n=sc.nextInt();
       System.out.println(s.add(n));
    }
}
