import java.util.*;
import java.lang.String;
class store
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        for(int i=0;i<str.length();i+=2)
        {
            if(i%2==0)
                {
                char ch=str.charAt(i);
                int s=str.charAt(i+1)-48;
                for(int j=0;j<s;j++)
                {
                    System.out.print(ch);
                }
                }
        }
    }
}
