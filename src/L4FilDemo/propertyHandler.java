package L4FilDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

public class propertyHandler {
    public static void main(String[] args) throws IOException {
        String file1 = "resource/file1.properties";
        String file2 = "resource/file2.properties";

        /*.Output:
Value Change: 1 (  a )
New keys added: 2 (d, e)
Keys deleted: 1 (c).*/

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

    static List<String> occuredList = new ArrayList<>();
    static Set<String> unOccuredList = new HashSet<>();
    static List<String> changedList = new ArrayList<>();
    static Set<String> deletedList = new HashSet<>();

    public static void propertyProcessor(Properties prpty1, Properties prpty2) {
        for (String key1 : prpty1.stringPropertyNames()) {

            for (String key2 : prpty2.stringPropertyNames()) {
                //Occurred Check
                if (key1.equals(key2)) {
                    //value changed
                    if (checkValue(key1, key2, prpty1, prpty2)) {
                        changedList.add(key1);
                    }
                    occuredList.add(key1);
                } else {
                    unOccuredList.add(key2);
                    if (occuredList.contains(key1)) unOccuredList.remove(key1);
                    if (occuredList.contains(key2)) unOccuredList.remove(key2);
                    if(!occuredList.contains(key1) && !unOccuredList.contains(key1)) deletedList.add(key1);
                    if(!occuredList.contains(key2) && !unOccuredList.contains(key2)) deletedList.add(key2);
                }
            }
        }
        System.out.println("Occured "+occuredList.size()+": "+Arrays.deepToString(occuredList.toArray()));
        System.out.println("New Added " + unOccuredList.size() + ": " + Arrays.deepToString(unOccuredList.toArray()));
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
