import java.util.Scanner;
//Strong Number
public class SecAQ2
{
	static int sum=0;
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		int no=sc.nextInt();
		int temp=no;
		
		int sum=checkPerfect(no);
		
		if(sum==temp)				//check for Strong Number
		{
			System.out.println("Perfect Number: ");
		}
		else
		{
			System.out.println("Not");
		}
	}	
		public static int checkPerfect(int no)
		{
			
			if(no!=0)
			{
				int rem=no%10;
				int fact=1;
				for(int i=1;i<=rem;i++)
				{
					fact=fact*i;						
				}
				sum+=fact;								
				no/=10;
			return checkPerfect(no);
			}
			else
			{
				return sum;
			}
		}
		
}