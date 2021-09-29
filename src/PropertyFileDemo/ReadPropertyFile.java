package PropertyFileDemo;

import javax.swing.*;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertyFile {
    public static void main(String[] args) throws Exception{
        FileInputStream fInputStream = new FileInputStream("resources/File1.properties");
        Properties prpty = new Properties();
        prpty.load(fInputStream);
    }
}
