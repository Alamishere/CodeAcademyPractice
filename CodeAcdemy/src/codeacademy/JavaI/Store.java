package codeacademy.JavaI;

public class Store {
    // instance fields
    String productType;
    double price;

    // constructor method
    public Store(String product, double initialPrice) {
        productType = product;
        price = initialPrice;
    }

    //Create a toString() method
    public String toString(){
        return "This store sells "+productType +"at a price of "+ price+".";
    }

    //we tested getting the toString() for a Lemonade store with a price of 1,
    // and got the wrong string! expected:<…store sells Lemonade[ ]at a price of 1.0.>
    // but was:<…store sells Lemonade[]at a price of 1.0.>

    // increase price method
    public void increasePrice(double priceToAdd){
        double newPrice = price + priceToAdd;
        price = newPrice;
    }

    // get price with tax method
    public double getPriceWithTax(){
        double tax = 0.08;
        double totalPrice = price + price*tax;
        return totalPrice;
    }

    // main method
    public static void main(String[] args) {
        Store lemonadeStand = new Store("Lemonade", 3.75);
        Store cookieShop = new Store("Cookies", 5);
        System.out.println(lemonadeStand);
        System.out.println(cookieShop);
    }
}