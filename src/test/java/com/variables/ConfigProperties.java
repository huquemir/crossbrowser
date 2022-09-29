package com.variables;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigProperties {
	
	public static ThreadLocal<Properties> property = new ThreadLocal<Properties>();
	private static String configPath = "Configuration/configsetting.properties";
	
	public static void initializepropertyfile() {
		
		Properties pr = new Properties();
		
		try {
			InputStream instm = new FileInputStream(configPath);
			
				pr.load(instm);
				property.set(pr);
			} catch (FileNotFoundException e) {				
				e.printStackTrace();
	
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
	}
	

}
