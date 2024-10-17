import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sortbyname implements Comparator<Product>{

    

    @Override
    public int compare(Product o1, Product o2) {
        
        return o1.getName().compareTo(o2.getName());
    }

    public static void main(String[] args) {
        
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 50000));
        products.add(new Product("Iphone", 100000));
        products.add(new Product("Asus Laptop", 60000));


        Collections.sort(products,new Sortbyname());
        System.out.println("\n sorted by name");
        for (Product product : products){
            System.out.println(product);

        }
    

    }

    
    
}
