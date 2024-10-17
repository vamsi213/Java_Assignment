import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sortbyprice implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2){
        if (o1 == null || o2 == null){
            throw new NullPointerException("Product objects cannot be null");
        }
        return Double.compare(o1.getprice(), o2.getprice());
    }


    public static void main(String[] args) {

        try{
        
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 50000));
        products.add(new Product("Iphone", 100000));
        products.add(new Product("Asus Laptop", 60000));

        if (products.contains(null)){
            throw new NullPointerException("Productb list conatins null value");
        }


        Collections.sort(products,new Sortbyprice());
        System.out.println("\n sorted by price");
        for (Product product : products){
            System.out.println(product);

        }
    

    }
    catch(NullPointerException e){
        System.out.println(e.getMessage());
    }
    
    
}
}
