package propertyFileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class PropertyChecker {
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

        //    propertyProcessor(prpty1, prpty2);
        doProcess(prpty1, prpty2);
        printer();
    }

    static List<String> occurredList = new ArrayList<>();
    static List<String> unOccurredList = new ArrayList<>();
    static List<String> changedList = new ArrayList<>();
    static List<String> deletedList = new ArrayList<>();

    public static void doProcess(Properties propty1, Properties propty2) {


        for (String i : propty1.stringPropertyNames()) {
            for (String j : propty2.stringPropertyNames()) {
                if (i.equals(j)) {
                    if (!propty1.getProperty(i).equals(propty2.getProperty(j))) {
                        changedList.add(i);
                    }
                    occurredList.add(i);
                    break;
                } else {
                    if (!occurredList.contains(j)) unOccurredList.add(j);
                }
            }
        }
    }

    public static void printer() {
        System.out.println(Arrays.deepToString(occurredList.toArray()));
        System.out.println(Arrays.deepToString(unOccurredList.toArray()));
    }


}
