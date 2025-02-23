//get file from absolute Path:
import java.io.*;

public class FileHandling
{
	public static void main(String args[])
	{
		File folder=new File("C:");
		if(folder!=null)
		{
			if(folder.exists()&&folder.isDirectory())
			{
				getResult(folder);
			}
			else{
				System.out.println("The folder could not read");
			}
		}
	}
	
	static void getResult(File folder)
	{
		System.out.println("Folder: "+folder.getAbsolutePath());
		
		File[] files=folder.listFiles();
		if(files != null)
		{
			for(File file:files)
			{
				if(file.isFile())
				{
					System.out.println(file.getAbsolutePath());
				}
				else if(file.isDirectory()){
					getResult(file);
				}
			}
		}
	}
}
