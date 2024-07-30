import java.util.Scanner;
class  reverse
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int rev=0;
		int n=0;
		while (num > 0) {
             n = num % 10; 
            rev = rev * 10 + n; 
            num /= 10; 
		}
		System.out.println("the reverse of the number is:"+rev);
        
	}
}
