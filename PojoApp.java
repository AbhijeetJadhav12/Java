import java.util.Scanner;

class Product
{
	int id, quan;
	double price;
	String name;
	int cat;
	int uCat;
	
	Product(int id, String name, double price, int quan, int cat)           //
	{
		this.id= id;
		this.name=name;
		this.price=price;
		this.quan=quan;
		this.cat=cat;
	}

		//getter methods
	int getId()
	{
		return id;
	}
	String getName()
	{
		return name;	
	}
	double getPrice()
	{
		return price;
	}
	int getQuan()
	{
		return quan;
	}
	int getCat()
	{
		return cat;
	}
	void updateStock(Product[] pd )
	{
		System.out.println("Highest Stock");
				int highQ=Integer.MIN_VALUE;
				for(Product p: pd)
					if(highQ<p.getQuan())			// check for highest Quantity
					{
						highQ=p.getQuan();
					}
				
					System.out.println();;
				for (Product p: pd)
					if(highQ==p.getQuan())
					{
					// Showing details
					System.out.println("ID:"+p.getId()+" Name:"+p.getName()+" Price:"+p.getPrice()+" Quantity:"+p.getQuan()+" Category:"+p.getCat());
					}
	}
	void displaySpecificCategory(Product[] pd, int uCat)
	{
		
				System.out.println();
				for (Product p: pd)
					if(uCat==p.getCat() )						//checking for specific category
					{

					// Showing details
						System.out.println("ID:"+p.getId()+" Name:"+p.getName()+" Price:"+p.getPrice()+" Quantity:"+p.getQuan()+" Category:"+p.getCat());	
					}	
	}
	void highestStock(Product[] pd, int uId,int newQuan)
	{
		System.out.println();
				
				 
				for (Product p: pd)
					if (uId==p.getId())
					{	
						p= new Product(p.getId(),p.getName(),p.getPrice(),newQuan,p.getCat());
					}
				
				System.out.println("Details after Updation:");
				for(Product p: pd)
					// Showing details
					System.out.println("ID:"+p.getId()+" Name:"+p.getName()+" Price:"+p.getPrice()+" Quantity:"+p.getQuan()+" Category:"+p.getCat());
				
	}
		
}
	//mainclass
public class PojoApp
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter number of product you want to add: ");
		int no = sc.nextInt();

		Product[] pd= new Product[no];    // array created 
	
			for(int i=0;i<pd.length;i++)
			{
				//pd[i]= new Product();
		
				System.out.println("Enter id:");
				int id= sc.nextInt();
					
				sc.nextLine();
				System.out.println("Enter name: ");	
				String name=sc.next();
	
				System.out.println("Enter price: ");
				double price= sc.nextDouble();

				System.out.println("Enter Quantity: ");
				int quan=sc.nextInt();

				sc.nextLine();
				System.out.println("Enter category:");
				int cat=sc.nextInt();	
	
				pd[i]= new Product(id, name, price, quan, cat);				//method calling
			}	
			pd[0].updateStock(pd);
			
			System.out.println("Enter category which you want to show: ");
			int uCat=sc.nextInt();
			pd[0].displaySpecificCategory(pd, uCat);
			
			System.out.println("Enter id which you want to update Quantity: ");
			int uId=sc.nextInt();
			System.out.println("Enter new Quantity");
			int newQuan=sc.nextInt();
			pd[0].highestStock(pd,uId, newQuan);
	}
}








