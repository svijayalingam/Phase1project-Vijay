package lockedMe;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FileDisplay {
	public void srtFile() 
	{
		// TODO Auto-generated method stub
		File srchdir=new
				File("C:\\Users\\Vijayalingam\\eclipse-workspace\\Phase1Project-Vijay");
		if(srchdir.isDirectory())
		{
		List<String>listFile=Arrays.asList(srchdir.list());
		Collections.sort(listFile);
		for(String s:listFile) {
			System.out.println(s);
			
		}
	}

	}
}
