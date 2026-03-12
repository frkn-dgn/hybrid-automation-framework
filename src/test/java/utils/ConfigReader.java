package utils;

import java.util.Properties;

public class ConfigReader {

    static Properties properties;

    static {

        try {

            properties = new Properties();

            properties.load(
                    ConfigReader.class
                            .getClassLoader()
                            .getResourceAsStream("config.properties")
            );

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static String getProperty(String key){

        return properties.getProperty(key);

    }

}