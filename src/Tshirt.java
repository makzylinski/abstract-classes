public class Tshirt extends ProductForSale {

    public Tshirt(ProductType type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails(ProductType type, double price, String description) {
        System.out.println("================");
        if(price < 20) {
            System.out.println("Discount!");
        } else {
            System.out.println("Regular price!");
        }
        System.out.println(type + ": " + description + ", $" + price);
        System.out.println("================");
    }
}
