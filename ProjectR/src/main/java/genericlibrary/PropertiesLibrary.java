package genericlibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesLibrary implements FrameWorkConstant{

	static FileInputStream fis;

	static FileOutputStream fos;

	static Properties property;

	public static String readData(String key) {

		// 1.Convert external file into java Readable
		
		try {
			fis = new FileInputStream(propertypath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 2.Create an object For Properties class
		property = new Properties();

		// 3.Load the Properties
		try {
			property.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 4.Read the Data
		return property.getProperty(key);

	}
	
	public static void writeData(String newkey, String newValue) {

		// 1.Convert external file into java Readable
		
		try {
			fis = new FileInputStream(propertypath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 2.Create an object For Properties class
		 property = new Properties();

		// 3.Load the Properties
		try {
			property.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 4.put the new data inside Properties file
		property.put(newkey, newValue);

		// 5.Convert java readable into external file
		
		try {
			fos = new FileOutputStream(propertypath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 6.store the New data
		try {
			property.store(fos, "Updated  New Key And Value");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Write Data Successfully");

	}


}
