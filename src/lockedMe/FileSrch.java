package lockedMe;

import java.io.File;

public class FileSrch {
public void srchFile(String str) {
	File fi=new
			File("C:\\Users\\Vijayalingam\\eclipse-workspace\\Phase1Project-Vijay\\"+str+".txt");
	if (fi.exists())
	{
		System.out.println("File"+fi.getName()+"Exists");
		System.out.println("Absolute path:"+fi.getAbsolutePath());
		System.out.println("Writeable"+fi.canWrite());
		System.out.println("Readable"+fi.canRead());
		System.out.println("File size in bytes"+fi.length());
	}
	else
	{
		System.out.println("File does not exist");
		
	}
}
}
