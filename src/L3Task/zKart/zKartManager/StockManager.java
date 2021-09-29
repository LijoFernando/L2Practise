package L3Task.zKart.zKartManager;

import Pojo.Product;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class StockManager {
    static Map<Integer, Product> productList = new HashMap<>();


    public static void fileWrite() throws Exception {
        try {
            FileWriter fr = new FileWriter("z-Kart_db.txt");
            //fr.write("hai");
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }


    public static void fileRead() throws FileNotFoundException {
        try (BufferedReader br = new BufferedReader(new FileReader("z-Kart_db.txt"))) {
            for (String line; (line = br.readLine()) != null; ) {
                loadProductMap(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void loadProductMap(String line) {
        String[] words = line.split(" ");
        //  System.out.println(Arrays.toString(words));
        Product product = new Product();
        product.setCategory(words[0]);
        product.setBrand(words[1]);
        product.setModel(words[2]);
        product.setPrice(Integer.parseInt(words[3]));
        int pdtId = productIdGenerate();
        product.setProductId(pdtId);
        productList.put(pdtId, product);
     //   System.out.println(productList.entrySet());
    }


    public static int productIdGenerate() {
        int productId = 0;
        productId = (int) (Math.random() * 1000);
        if (productList.get(productId) != null) {
            productIdGenerate();
        }
        return productId;
    }

    public static Map getStockList() throws FileNotFoundException {
        if (productList.isEmpty()) {
            fileRead();
        }
        return productList;
    }

}
