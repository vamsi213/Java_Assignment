import java.util.*;

public class Product {

    private String name;
    private double price;

    public Product(String name,double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }

    public double getprice(){
        return price;
    }
    
    @Override
    public String toString() {
        //return "Product : " + name;

        return "product ; " + name + " " + "Price : " + price;
    }
}
