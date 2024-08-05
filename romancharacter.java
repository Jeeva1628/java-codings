import java.util.Scanner;
import java.lang.String;
import java.util.Arrays;
class roman {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num[]={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String s[]={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int dif=0;
        String ans="";
        for(int i=num.length-1;i>=0;i--)
        {
            while(n>=num[i])
            {
             n=n-num[i];
             ans+=s[i];
            }
        }
        System.out.print(ans);
    }
}
