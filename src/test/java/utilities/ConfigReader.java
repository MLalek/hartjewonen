package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;
    static {
        //path of teh configuration.properties file
        String path = "configuration.properties";
        try {
            //Openning the configuration.properties file
            FileInputStream fileInputStream = new FileInputStream(path);
            //loading the file
            properties = new Properties();
            properties.load(fileInputStream);
            //closing the file
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //Create a method to READ
    //This method weill get the KEY and return the VALUE
    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
