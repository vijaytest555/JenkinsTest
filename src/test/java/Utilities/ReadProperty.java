
package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class ReadProperty extends FileAppender{
	final static Logger logger = Logger.getLogger(ReadProperty.class);
	public  String get_propValue(String value) {
		String val = null;
		String propertyValue = System.getProperty(value);
		if(propertyValue!=null) {
			return propertyValue;
		}else {
			Properties prop = new Properties();
			InputStream input = null;
			try {
				input = new FileInputStream("./InputFiles/config.properties");
				prop.load(input);
				val = prop.getProperty(value);
			} catch (IOException ex) {
				logger.error(ex.getMessage());
			}
		}
		return val;
	}
	
	public void initilizeLog() {

		try (InputStream input = new FileInputStream("./InputFiles/log4j.properties")) {
			Properties prop = new Properties();
			prop.load(input);
			String fileProp = prop.getProperty("log4j.appender.file.File");
			fileProp="Output/log/Serverlog_"+timestampinSeconds()+".log";
			prop.setProperty("log4j.appender.file.File", fileProp);
			PropertyConfigurator.configure(prop);
			deleteFile();
		}catch(Exception e) {
			logger.error(e.getMessage());
		}
	}


	private static void deleteFile() {
		File file = new File("log/Serverlog.log"); 
		if(file.delete()){ 
			logger.info("deleteFile() :: File deleted successfully"); 
		}else{ 
			logger.info("deleteFile() :: Failed to delete the file"); 
		} 
	}


	public static String timestampinSeconds() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss-SSS").format(new Date());
	}

	
	public static void main(String[] args) {
		ReadProperty ReadProperty = new ReadProperty();
		ReadProperty.initilizeLog();
		System.out.println(ReadProperty.get_propValue("URL"));
		

		
	}
}
