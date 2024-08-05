public abstract class ProductForSale {
    private ProductType type;
    private double price;
    private String description;

    public ProductType getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public ProductForSale(ProductType type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double getSalesPrice(int quantity) {
        return quantity * price;
    }

    public void printPricedItem(int quantity) {
        System.out.println("$" + getSalesPrice(quantity));
    }

    public abstract void showDetails(ProductType type, double price, String description);
}
