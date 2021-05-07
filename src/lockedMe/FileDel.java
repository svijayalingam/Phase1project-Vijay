package lockedMe;

import java.io.File;

public class FileDel {
	public void delFile(String str) {
		File fi =new
				File("C:\\Users\\Vijayalingam\\eclipse-workspace\\Phase1Project-Vijay\\"+str+".txt");
		if(fi.delete())
		{
	System.out.println("File that is Deleted is:"+fi.getName());
}
else
{
	System.out.println("File does not exist to be deleted");
}
}
}
