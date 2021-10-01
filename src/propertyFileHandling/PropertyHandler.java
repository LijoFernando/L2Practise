package propertyFileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class PropertyHandler {
    public static void main(String[] args) throws IOException {
        String file1 = "resource/file1.properties";
        String file2 = "resource/file2.properties";

        /*.Output:
        Value Change: 1 (a)
        New keys added: 2 (d,e)
        Keys deleted: 1 (c). */

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

        propertyProcessor(prpty1, prpty2);

    }

    static List<String> occurredList = new ArrayList<>();
    static List<String> unOccurredList = new ArrayList<>();
    static List<String> changedList = new ArrayList<>();
    static List<String> deletedList = new ArrayList<>();

    public static void propertyProcessor(Properties property1, Properties property2) {
        for (String key1 : property1.stringPropertyNames()) {

            for (String key2 : property2.stringPropertyNames()) {
                //Occurred Check
                if (key1.equals(key2)) {
                    //value changed
                    if (checkValue(key1, key2, property1, property2)) {
                        changedList.add(key1);
                    }
                    occurredList.add(key1);
                    break;
                } else if (!occurredList.contains(key2) && !unOccurredList.contains(key2)) {
                    unOccurredList.add(key2);
                }
            }
            if (!occurredList.contains(key1) && !unOccurredList.contains(key1)) deletedList.add(key1);
        }
        System.out.println("Occurred " + occurredList.size() + ": " + Arrays.deepToString(occurredList.toArray()));
        System.out.println("New Added " + unOccurredList.size() + ": " + Arrays.deepToString(unOccurredList.toArray()));
        System.out.println("Changed " + changedList.size() + ": " + Arrays.deepToString(changedList.toArray()));
        System.out.println("Deleted " + deletedList.size() + ": " + Arrays.deepToString(deletedList.toArray()));
    }

    public static boolean checkValue(String key1, String key2, Properties prpty1, Properties prpty2) {
        String value1 = prpty1.getProperty(key1);
        String value2 = prpty2.getProperty(key2);
        if (!value1.equals(value2)) {
            return true;
        }
        return false;
    }

}
