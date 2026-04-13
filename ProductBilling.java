// Create ProductBilling class and implement overloaded methods for billing 1, 2, and 3 products.

public class ProductBilling{

    // Step 1: Billing For 1 Product.

    void bill(int price1){
        int total = price1;
        System.out.println("Total for 1 Product: " + total);
    }

    // Step 2: Billing for 2 Products.

    void bill(int price1, int price2){
        int total = price1 + price2;
        System.out.println("Total for 2 Products: " + total);
    }

    void bill(int price1, int price2, int price3){
        int total = price1 + price2 + price3;
        System.out.println("Total for 3 Produts: " + total);
    }


        public static void main(String[] args){

            //Step 3: Create a object of ProductBilling class.

            ProductBilling pb = new ProductBilling();

            // Step 4: Call OverLoaded Methods to calculate Bill for 1, 2, and 3 products.

            pb.bill(100);     // 1 Product.
            pb.bill(100, 200);       // 2 Products.
            pb.bill(100, 200, 300);  // 3 Products.

           
     }

}