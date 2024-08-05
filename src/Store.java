import java.util.ArrayList;

public class Store {
    public static void main(String[] args) {
        ArrayList<ProductForSale> products = new ArrayList<>();

        products.add(new Jacket(ProductType.JACKET, 39.99, "A simple leather Jacket."));
        products.add(new Shoes(ProductType.SHOES, 29.99, "Nike shoes"));
        products.add(new Tshirt(ProductType.TSHIRT, 19.99, "Your fav band T-shirt"));

        printOrderedItems(products);
        addItemToOrder(products, ProductType.TSHIRT, 59.99, "Misfits T-Shirt.");
        printOrderedItems(products);

    }

    public static void printOrderedItems(ArrayList<ProductForSale> list) {
        for(ProductForSale product : list) {
            System.out.println("============");
            product.showDetails();
        }
    }

    public static void addItemToOrder(ArrayList<ProductForSale> products, ProductType type, double price, String description) {
        switch (type) {
            case SHOES -> products.add(new Shoes(ProductType.SHOES, price, description));
            case JACKET -> products.add(new Jacket(ProductType.JACKET, price, description));
            case TSHIRT -> products.add(new Tshirt(ProductType.TSHIRT, price, description));
            default -> System.out.println("Wrong data passed");
        }
    }
}
