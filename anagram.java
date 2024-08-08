import java.util.*;
import java.util.Arrays;
import java.lang.String;

class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter String1");
        String s1=sc.nextLine();
        System.out.println("enter String2");
        String s2=sc.nextLine();
        String str1=s1.toLowerCase();
        String str2=s2.toLowerCase();
        char A[]=str1.toCharArray();
        Arrays.sort(A);
        char B[]=str2.toCharArray();
        Arrays.sort(B);
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]);
        }
        System.out.println();
        for(int i=0;i<B.length;i++)
        {
            System.out.print(B[i]);
        }
         System.out.println();
        System.out.println(Arrays.equals(A,B)?"yes":"no");
    }
}
