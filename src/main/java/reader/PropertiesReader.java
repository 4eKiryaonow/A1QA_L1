package reader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

    protected static Properties PROPERTIES;

    static {
        try (FileInputStream fileInputStream = new FileInputStream("src/test/resources/config.properties")) {

            PROPERTIES = new Properties();
            PROPERTIES.load(fileInputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getProperty(String key) {

        return PROPERTIES.getProperty(key);
    }
}

