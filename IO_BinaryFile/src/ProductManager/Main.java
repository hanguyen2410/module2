package ProductManager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ProductManager> products = new ArrayList<>();
        products.add(new ProductManager(1, "Mazda CX5", "Mazda", 80000));
        products.add(new ProductManager(2, "G63", "Mercedes", 700000));
        products.add(new ProductManager(3, "GT40", "Mustang", 8000000));

        List<ProductManager> productDataFromFile = readDataFromFile("product.txt");
        for(ProductManager product : productDataFromFile){
            System.out.println(product);
        }
        WriteToFile("product.txt",products);
    }
    public static List<ProductManager> readDataFromFile(String path){
        List<ProductManager> products = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            products = (List<ProductManager>) ois.readObject();
            fis.close();
            ois.close();
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return products;
    }
    public static void WriteToFile(String path, List<ProductManager> products){
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(products);
            oos.close();
            fos.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
