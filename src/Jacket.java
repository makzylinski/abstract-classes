public class Jacket extends ProductForSale {
    public Jacket(ProductType type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println(type + " $" + price);
        System.out.println(description);
    }
}
