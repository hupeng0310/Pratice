package Util.Properties;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) {
        Properties properties = new Properties();
        File file = new File("Resource/Properties/config.properties");
        try {
            FileReader fileReader = new FileReader(file);
            properties.load(fileReader);
            System.out.println(properties.getProperty("Class"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
