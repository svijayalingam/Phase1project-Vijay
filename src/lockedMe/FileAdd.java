package lockedMe;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class FileAdd {
	public static void main(String[] args) {
}
	public void creFile(String str) {
	try {
		//Scanner s=new Scanner(System.in);
	
		File fi=new
				File("C:\\Users\\Vijayalingam\\eclipse-workspace\\Phase1Project-Vijay\\"+str+".txt");
		if (fi.createNewFile())
		{
			System.out.println("File created is: "+fi.getName());
		}	
		else
		{
			System.out.println("File already exists");
					}
	}catch (IOException e)
	{
		System.out.println(e);
	}
}

	}
	
