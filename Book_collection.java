
import java.util.Scanner;
class Book
{
	String title, author;
	int isbn;
	
	Book(String title, String author, int isbn)
	{
		this.title=title;
		this.author=author;
		this.isbn=isbn;
	}
	
	String getTitle()
	{
		return title;
	}
	
	String getAuthor()
	{
		return author;
	}
	 
	int getIsbn()
	{
		return isbn;
	}	
	  
	void displayAllBooks()
	{
		System.out.println("\nTitle:"+title+"\tName of Author:"+author+"\tISBN Number:"+isbn);
	}
	
}

class Library
{
	Book[] collection;
	int count;
	
	Library()
	{
		collection= new Book[100];
		count=0;
	}
	
	void addBook(Book book)
	{
		if (count< collection.length)
		{
			collection[count]=book;
			System.out.println(book.title+" added to ");
			count++;
		}
		else
		{
			System.out.println("Collection get Full");
		}
	}
	
	void removeBook(int risbn)
	{
		boolean added=false;
		for(int i=0;i<count;i++)
		{
			
			if(collection[i].isbn==risbn)
			{
				System.out.println(collection[i].title+ " remove from collection");
				for(int j=i;j<count-1;j++)
				{
					collection[j]=collection[j+1];
				}
					collection[count-1]=null;
					count--;
					added=true;
					break;
			}
		}
			if(!added)
			{
				System.out.println("Id not found in collection");
			}
	}
	
	void displayBookCollection()
	{
		if(count == 0)
		{
			System.out.println("Book Not Available in Collection: ");
		}
		else
		{
			for(int i=0;i<count;i++)
			{
				collection[i].displayAllBooks();
			}
		}
	}
	void searchBook(String name )
	{
		for(int i=0;i<count;i++)
		{
			if(name.equals(collection[i].getTitle()))
			{
				collection[i].displayAllBooks();
			}
		}
	}
}
public class LibraryManagementSystem
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Number of Books you want to add: ");
		int no= sc.nextInt();
		
		Book[] book= new Book[no];
		for(int i=0;i<book.length;i++)
		{
			sc.nextLine();
			System.out.println("\nEnter details of book "+(i+1));
			System.out.println("Enter title of book:");
			String title= sc.nextLine();
			
			System.out.println("Enter Name of author: ");
			String author=sc.nextLine();
			
			System.out.println("ENter ISBN number of book: ");
			int isbn= sc.nextInt();
			
			book[i]= new Book(title, author, isbn);
		}
		
		Library lab= new Library();
		
		while(true)
		{
			System.out.println("\n=====Menu=====");
			System.out.println("1. For Add book in collecction");
			System.out.println("2. For remove book from collection");
			System.out.println("3. Display Book in collection ");
			System.out.println("4. For title of book for search");
			System.out.println("5. For Exit");
			int choice= sc.nextInt();
			
			switch(choice)
			{
				case 1: 
				
					System.out.println("Available book");
					for(Book b: book)
					{
						b.displayAllBooks();
					}
					
					System.out.println("Enter isbn of book");
					int risbn= sc.nextInt();
					boolean found= false;
					for(Book bk: book)
					{
						if(risbn== bk.getIsbn())
						{
							lab.addBook(bk);
							found= true;
						}
					}
					
					if(!found)
					{
					//	System.out.println("Book with "+ gisbn+" not found");
					}
					break;
					
				case 2:
						System.out.println("Enter isbn number to from list to remove from collection: ");
						int n=sc.nextInt();
						lab.removeBook(n);
						break;
						
				case 3:
					lab.displayBookCollection();
					break;
				
				case 4:
					sc.nextLine();
					System.out.println("Enter title of book: ");
					String name = sc.nextLine();
					lab.searchBook(name);
					break;
					
				case 5:
					System.out.println("Thank You");
					return;
			}
		}
	}
}