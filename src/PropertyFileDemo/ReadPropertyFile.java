package PropertyFileDemo;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertyFile {
    public static void main(String[] args) throws Exception {
        String file1 = "resources/File1.properties";
        String file2 = "resources/File2.properties";

        //valid File check
        System.out.println("File1: " + validFile(file1));
        System.out.println("File2: " + validFile(file2));

        FileInputStream fInputStream1 = new FileInputStream(file1);
        FileInputStream fInputStream2 = new FileInputStream(file2);
        Properties prpty1 = new Properties();
        Properties prpty2 = new Properties();

        //properties from files
        prpty1.load(fInputStream1);
        prpty2.load(fInputStream2);

        //print properties
        System.out.println(prpty1.toString());
        System.out.println(prpty2.toString());

        //print changed value
        getChangedValue(prpty1, prpty2, "username");

        //print properties
        System.out.println(prpty1.toString());
        System.out.println(prpty2.toString());
    }

    //validFileMethod
    public static boolean validFile(String filePath) {
        File file = new File(filePath);
        if (!file.isFile() || !file.exists()) {
            return false;
        }
        return true;
    }

    //changed value
    public static void getChangedValue(Properties properties1, Properties properties2, String property) {
        if (properties2.contains(property)) {
            return;
        }

        String value1 = String.valueOf(properties1.get(property));
        String value2 = properties2.getProperty(property, value1);
        System.out.println(value1 + ", " + value2);
        if (value1.equals(value2)) {
            System.out.println(value1);
        } else {
            System.out.println(value2);
        }
    }
}
