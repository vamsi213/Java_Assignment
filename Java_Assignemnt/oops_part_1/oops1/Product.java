package oops1;

public class Product {

    int prod_id;
    String prod_name;
    double price;
    int quantity_on_hand;


    public Product(int prod_id, String prod_name, double price, int quantity_on_hand) {
        this.prod_id = prod_id;
        this.prod_name = prod_name;
        this.price = price;
        this.quantity_on_hand = quantity_on_hand;

    
    
    }

    public Product(int prod_id, String prod_name, double price) {
        this.prod_id = prod_id;
        this.prod_name = prod_name;
        this.price = price;
    }

    public Product(){
        this.prod_id = 0; 
        this.prod_name = "Unknown";
        this.price = 0.0;
        this.quantity_on_hand = 0;
    }

    public double getNetPrice(){

        return price + (price * 0.12);

    }

    public void purchase(int quantity){

        if(quantity>0){

            this.quantity_on_hand += quantity;
            System.out.println("No of units purchased: " + this.quantity_on_hand);
        }
        else{
            System.out.println("Please purchase something");
        }
    }

    public void sell(int quantity){
        System.out.println("No of Products sold");
    

    }

    public static void main(String[] args) {
        
        Product p = new Product(101,"Iphone",100000,1);
        System.out.println(p.price);
        System.out.println(p.prod_name);
    }
    

    
    
}
