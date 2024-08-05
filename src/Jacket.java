public class Jacket extends ProductForSale {
    public Jacket(ProductType type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails(ProductType type, double price, String description) {
        System.out.println("================");
        System.out.println(type + " $" + price);
        System.out.println(description);
        System.out.println("================");
    }
}
