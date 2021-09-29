package L3Task.L3Final.zKartManager;

import CustomException.CustomizedException;
import Pojo.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StockManager {
    static Map<String, List<Product>> productList = new HashMap<>();


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


    public static void fileRead() throws CustomizedException {
        try (BufferedReader br = new BufferedReader(new FileReader("z-Kart_db.txt"))) {
            for (String line; (line = br.readLine()) != null; ) {
                loadProductMap(line);
            }
        } catch (Throwable e) {
            throw new CustomizedException("Product List Error");
        }

    }

    public static void loadProductMap(String line) {
        String[] words = line.split(" ");
        //  System.out.println(Arrays.toString(words));
        Product product = new Product();
        String category = words[0];
        product.setCategory(category);
        product.setBrand(words[1]);
        product.setModel(words[2]);
        product.setPrice(Integer.parseInt(words[3]));
        int pdtId = productIdGenerate();
        product.setProductId(pdtId);
        List<Product> productListByCategory = addByCategory(category, product);
        productList.put(category, productListByCategory);
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

    public static List<Product> addByCategory(String category, Product product) {
        List<Product> productListByCategory;
        if (productList.containsKey(category)) {
            productListByCategory = productList.get(category);
            productListByCategory.add(product);
        } else {
            productListByCategory = new ArrayList<>();
            productListByCategory.add(product);
        }
        return productListByCategory;
    }

    public static Map getStockList() throws CustomizedException {
        if (productList.isEmpty()) {
            fileRead();
        }
        return productList;
    }
    /* public static List<String> getCategory(){

    }*/
}
