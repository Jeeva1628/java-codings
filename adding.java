import java.util.*;
import java.lang.String;
class result
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=new String("hello");
        String s2=new String("saveetha");
        int x=s1.length();
        int y=s2.length();
        int max=x>y?x:y;
        for(int i=0;i<max;i++)
        {
            if(x<y)
            {
                System.out.println(s1.charAt(i%x));
                System.out.println(s2.charAt(i));
            }
            else
            {
                System.out.println(s1.charAt(i));
                System.out.println(s2.charAt(i%y));
            }
            
        }
    }
}
