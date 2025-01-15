/*Q2. WAP to create class name as Product as POJO class with field id,name and qty and price and you have to create Shop as class with following methods 
void setProducts(Customer customer,Product …p): this method can accept the n number of products 
void findBill(): this function can find the bill of a customer using the following format.
  
*/

import java.util.Scanner;
class Product
{
	int pId;
	String pName;
	double price;
	int qty;
	
	Product(int pId, String pName, int qty, double price)
	{
		this.pName=pName;
		this.pId=pId;
		this.qty=qty;
		this.price=price;
	}
	
	void showProducts()
	{
		//System.out.println("Id\tName\tQuantity\tRate");
		System.out.println(pId+"\t"+pName+"\t"+"\t"+qty+"\t"+price);
	}
}

class Customer
{
	Product[] products;
	String name;
	int id;
	String address;
	Customer(String name, int id, String address)
	{
		this.name=name;
		this.id=id;
		this.address=address;
	}
	void setProducts( Product ...p)
	{
		products=p;
	}
	
	void findBill()
	{
		System.out.println("Name:"+name+"\tId:"+id+"\tAddress:"+address);
		System.out.println();
		double totalBill=0;
		for(Product pro:products)
		{
			pro.showProducts();
			totalBill+=(pro.qty*pro.price);
		}
		System.out.println("Total Bill: "+totalBill);
	}
}
public class ShoppingBill
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter total Customer");
		int totalCustomer=sc.nextInt();
		Customer customer[]=new Customer[totalCustomer];
		Product product[];
		for(int i=0;i<customer.length;i++)
		{
			System.out.println("\nEnter Details of Customer "+(i+1));
			sc.nextLine();
			System.out.println("Enter name:");
			String name=sc.nextLine();
			System.out.println("Enter Id");
			int id=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Address");
			String address=sc.nextLine();
			
			System.out.println("Enter total number of product for customer: "+(i+1));
			int totalProducts=sc.nextInt();
			product=new Product[totalProducts];
			for(int j=0;j<product.length;j++)
			{
				System.out.println("Id");
				int pId=sc.nextInt();
				System.out.println("Enter Name: ");
				sc.nextLine();
				String pName=sc.nextLine();
				System.out.println("Enter Quantity: ");
				int qty=sc.nextInt();
				System.out.println("enter Rate: ");
				double price=sc.nextDouble();
				
				product[j]=new Product(pId,pName,qty,price);
			}
			customer[i]=new Customer(name,id,address);
			customer[i].setProducts(product);
		}
		System.out.println("Customer Details: ");
		for(Customer cust:customer)
		{
			cust.findBill();
			System.out.println();
		}
	}
}