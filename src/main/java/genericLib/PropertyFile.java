package genericLib;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {

	//how to read the data from propertyfile
	public String getPropertyfiledata(String key) throws IOException//passing parameter to the method
	{//this method is nonStatic so need to create an object in the BaseCLASS
		
		Properties p=new Properties();
		FileInputStream fis= new FileInputStream(AutoConstant.propertyFilePath);
		p.load(fis);
		return p.getProperty(key);
	}
}
