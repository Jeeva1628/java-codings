import java.util.*;
import java.lang.String;
class store
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        int temp=1;
        for(int i=0;i<str.length();i++)
        {
            for(int j=0;j<=i;++j)
            {       
                    char ch=str.charAt(j);
                    System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
