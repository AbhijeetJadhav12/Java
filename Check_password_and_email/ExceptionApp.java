import java.util.Scanner;
class Check extends RuntimeException
{
	String message;
	Check(String message)
	{
		this.message=message;
	}
	public String getErrorMessage()
	{
		return message;
	}
}
class CheckEmail
{
	void checkEmail(String email)
	{
		int dotCount=0,count=0;
		int indexOfDot=0;
		for(int i=0;i<email.length();i++)
		{
			char ch=email.charAt(i);
			if(ch=='@')
			{
				count++;
			}
			if(ch=='.')
			{
				indexOfDot=i;
				dotCount++;
			}
		} 
		if(count!=1)
		{
			 throw new Check(" InvalidEmailFormatException: Your is Invalid");
		}
		else if(email.substring(indexOfDot+1).length()>=2 && email.substring(indexOfDot+1).length()<=3)
		{
			System.out.println("Your email is Valid");
		}
		else{
			 throw new Check(" InvalidEmailFormatException: after subString Your is Invalid");
		}
	}
}
class CheckPassword
{
	public void chekPassword(String password)
	{
		int capitalLetterCount=0,digitCount=0,specialCharacterCount=0;
		for(int i=0;i<password.length();i++)
		{
			char ch=password.charAt(i);
			if(ch<='A' && ch>='Z')
			{
				capitalLetterCount++;
			}
			if(ch<=0 && ch>=9)
			{
				digitCount++;;
			}
			if((ch<=32 && ch>=47)|| (ch<=58 && ch>=64))
			{
				specialCharacterCount++;
			}
		}
		
		if(password.length()<8)
		{
			throw new Check("InvalidPasswordException");
		}
		else if(capitalLetterCount>0||digitCount>0||specialCharacterCount>0)
		{
			throw new Check("InvalidPasswordException second");
		}
		else{
			System.out.println("Your password is valid");
		}
		
	}
}
public class ExceptionApp
{
	public static void main(String arsg[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter email  and email");
		String email=sc.nextLine();
		//sc.nextLine();
		String password=sc.nextLine();
		try
		{
			CheckEmail cm= new CheckEmail();
			cm.checkEmail(email);
		}
		catch(Check e)
		{
			System.out.println("Error: "+e.getErrorMessage());
		}
		try{
			CheckPassword cp= new CheckPassword();
			cp.chekPassword(password);
		}
		catch(Check e)
		{
			System.out.println("Error: "+e.getErrorMessage());
		}
	}
}