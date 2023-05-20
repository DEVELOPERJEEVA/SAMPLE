import java.util.Scanner;
class A 
{
	public static void main(String args[])
	{
		Scanner object=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=object.nextInt();
		int x=2;
	    int a[]=new int[n];
		for(int i=0; i<=n;i++)
		{
			a[i]=object.nextInt();
		}
		for(int i=0; i<=n;i++)
		{
			int d=x*a[i];
			if(d%10!=2)
			{
				System.out.println(d);
			}
		}
	}
}