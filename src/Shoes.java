public class Shoes extends ProductForSale {
    public Shoes(ProductType type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(type + " with the price of $" + price);
        System.out.println(description);
    }
}
