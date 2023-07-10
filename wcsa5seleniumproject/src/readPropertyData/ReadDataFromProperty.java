package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperty {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./data/config.properties");
	Properties pro = new Properties();
	pro.load(fis);
	String data = pro.getProperty("Username");
	System.out.println(data);
	

	}

}
