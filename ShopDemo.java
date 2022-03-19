import java.util.*;

class ProductItem {
    int id ;
    private float price;
    ProductItem(int id, float price){
        this.id = id;
        this.price = price;
    }
    public String toString(){
        return "ID: " + id + "PRICE: " + price;
    }
    float getPrice(){
        return price;
    }
}

 class ShoppingCart {
    int custId;
    Vector itemsv;
    ShoppingCart(int custId){
        this.custId = custId;
        itemsv = new Vector();
    }
    public void additem(ProductItem pit){
        itemsv.addElement(pit);
    }
    public void remoiveItem(ProductItem pit){
        itemsv.remove(pit);
    }
    public void doPayment(){
        float amt = 0.0f;
        for(int i=0;i<itemsv.size();i++){
            amt += ((ProductItem)itemsv.get(i)).getPrice();
        }
        System.out.println("Total Price : "+amt);
    }
}

public class ShopDemo {
    public static void main(String[] args) {
        int count = 0;
        ShoppingCart sc = new ShoppingCart(1);
        ProductItem it1 = new ProductItem(count++, 200);
        sc.additem(it1);
        ProductItem it2 = new ProductItem(count++, 300);
        sc.additem(it2);
        ProductItem it3 = new ProductItem(count++, 600);
        sc.additem(it3);
        sc.remoiveItem(it2);
        sc.doPayment();
    }
}
