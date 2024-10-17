package oops1;

public class Products {

    protected String name;
    protected double base_price;

    public Products(String name, double base_price) {
        this.name = name;
        this.base_price = base_price;
    }

    public void print() {
        System.out.println("Product Name: " + name);
        System.out.println("Base Price: " + base_price);
 
    }

    public double getNetPrice() {
        return base_price;
    }

    public void setPrice(double price) {
        this.base_price = price;
    }


}

class ImportedProducts extends Products{

    private double import_duty;

    public ImportedProducts(String name, double base_price, double import_duty) {
        super(name, base_price);
        this.import_duty = import_duty;
    }

    public void setImportDuty(double duty) {
        this.import_duty = duty;
    }

    @Override
    public double getNetPrice() {
        
        return base_price + import_duty;
    }

    @Override
    public void print() {
    
        super.print();
    }

}

class DiscountedProducts extends Products{

    private double discount_rate;


    public DiscountedProducts(String name, double base_price, double discount_rate) {
        super(name, base_price);
        this.discount_rate = discount_rate;
    }

    public void setDiscountRate(double rate) {
        this.discount_rate = rate;
    }

    @Override
    public double getNetPrice() {
        return base_price - (base_price * discount_rate / 100);
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Discount Rate: " + discount_rate + "%");
    }

    public static void main(String[] args) {
        
        ImportedProducts importedProduct = new ImportedProducts("Luxury Car", 50000, 5000);
        DiscountedProducts discountedProduct = new DiscountedProducts("Smartphone", 800, 10);


        importedProduct.print();
        System.out.println("Net Price: " + importedProduct.getNetPrice());
        System.out.println();

        discountedProduct.print();
        System.out.println("Net Price: " + discountedProduct.getNetPrice());
        System.out.println();


        if (importedProduct instanceof ImportedProducts) {
            ImportedProducts ip = (ImportedProducts) importedProduct;
            ip.setImportDuty(6000); 
            System.out.println("Updated Import Duty: " + ip.getNetPrice());
        }

        if (discountedProduct instanceof DiscountedProducts) {
            DiscountedProducts dp = (DiscountedProducts) discountedProduct; 
            dp.setDiscountRate(15); 
            System.out.println("Updated Discounted Price: " + dp.getNetPrice());
        }


    }

}