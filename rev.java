import java.util.*;
import java.lang.String;
class result
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String s1=sc.nextLine();
        String s2="";
        int x=s1.length()-1;
        for(int i=x;i>=0;i--)
        {
            char a=s1.charAt(i);
            s2=s2+a;
        }
        System.out.println("reverse of string: "+s2);
    }
}
