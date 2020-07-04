package managers;

import java.io.BufferedReader;import java.io.FileReader;import java.io.IOException;import java.util.Properties;

public class ConfigReader {

    private static Properties properties;

    public ConfigReader(String app) throws IOException {
        String propFilePath = "C:\\IJProjs\\NABootFW\\src\\test\\resources\\props\\"+app+".properties";

        BufferedReader bReader;

        //load the buffered reader object with the file
        bReader = new BufferedReader(new FileReader(propFilePath));
        properties = new Properties();

        //load the properties object with buffered reader object
        properties.load(bReader);
        bReader.close();
    }

    public String getPropertyValue(String key) {
        return properties.getProperty(key);
    }
}
