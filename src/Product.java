public class Product {
    double price;
    int quanity;
    String name;

    public Product(String initialName, double initialPrice, int initialQuantity) {
        this.name = initialName;
        this.price = initialPrice;
        this.quanity = initialQuantity;
    }

    public void printProduct() {
        System.out.println(name + "price " + price  +  quanity + " pcs");
    }

    public static void main(String[] args) {
        Product banana = new Product("Banana", 1.1, 13 );

        banana.printProduct();
    }
}
