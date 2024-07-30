import java.util.Scanner;
class pyramid 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the height");
		int n=Integer.parseInt(args[0]);
		if(args[0].length()>=1)
		{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
		{
			System.out.print("* ");
		}
		System.out.println();
		}
		}
		else
		{
			System.out.println("invalid input");
		}
	}
}
