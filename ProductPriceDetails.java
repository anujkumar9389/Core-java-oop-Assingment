// Create a Product class with private variables and getter/setter methods.

public class ProductPriceDetails{

    // Step 1: Create Private Variables for product name nad price.

    private String productname;
    private double productprice;

    // Step 2: Create Getter method for product name and price.

    public String getproductname(){
        return productname;
    }

    public double getprice(){
        return productprice;
    }

    // Step 3: Create Setter method for Product name and price.

    void setproductname(String productname){
        this.productname = productname;
    }
    
    void setprice(double price){
        productprice = price;
    }

    public static void main(String[] args){

        // Step 4: Create an object of ProductPriceDetails class.

        ProductPriceDetails p1 = new ProductPriceDetails();

        // Step 5: Set product name and price using setter methods.

        p1.setproductname("MotoCycle");
        p1.setprice(300000);

        // Step 6: Get product name and price using getter methods and print them.

        System.out.println(" Product Name: " + p1.getproductname());
        System.out.println(" Product Price: " + p1.getprice());
    }
}