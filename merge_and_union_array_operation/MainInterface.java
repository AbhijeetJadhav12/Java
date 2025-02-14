import java.util.Scanner;
interface ArrayOperation
{
	
	default void acceptArray(int a[],int b[])
	{
	}
	int [] getResult();
	
}
class MergeArray implements ArrayOperation
{
	int a[];
	int b[];
	public void acceptArray(int a[], int b[])
	{
		this.a=a;
		this.b=b;
	}
	public int [] getResult()
	{
		int n=(a.length+b.length);
		int [] mergedArray=new int [n];
		int k=0;
		for( int i=0;i<a.length;i++)
		{
			mergedArray[k++]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			mergedArray[k++]=b[i];
		}
		return mergedArray;
	}
}

class UnionArray implements ArrayOperation
{
	int a[];
	int b[];
	public void acceptArray(int a[],int b[])
	{
		this.a=a;
		this.b=b;
	}
	public int [] getResult()
	{
		int n=(a.length+b.length);
		int c[]=new int [n];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			c[k++]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			boolean setElement=false;
			for(int j=0;j<k;j++)
			{
				if(b[i]==c[j])
				{
					setElement=true;
					break;
				}
			}
			if(!setElement)
			{
				c[k++]=b[i];
			}
		}
		int[] unionArray=new int[k];
		
		for(int i=0;i<k;i++)
		{
			unionArray[i]=c[i];
		}
		return unionArray;
	}
}
public class MainInterface
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
	
		int a[]=new int[3];
		System.out.println("Enter element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int b[]=new int[3];
		System.out.println("Enter element");
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		ArrayOperation ap=null;
		while(true)
		{
			System.out.println("\nPress 1.for MergedArray or 2.for UnionArray");
			System.out.println("Enter choice: ");
			int choice=sc.nextInt();
			
			if(choice==1)
			{
				ap=new MergeArray();
			}
			else if(choice==2)
			{
				ap=new UnionArray();
			}
			else if(choice==3)
			{
				System.exit(0);
			}
			else{
				System.out.println("Invalid choice");
			}
		
			ap.acceptArray(a,b);
			int result[]=ap.getResult();
			System.out.println("Result Array: ");
			for(int ar:result){
				System.out.print(ar+"\t");
			}
		}
	}
}