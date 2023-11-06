package Products;

public class ProductTester {
    public static void main(String[] args) {
        Product prod = new Product();
        Product prod1 = new Product();
        Product prod2 = new Product("Television",5,859.32,"TV123456");
        Product prod3 = new Product("Radio",26,96.19,"RAD12345");
        Product prod4 = new Product("Computer",5,859.24,"PC123456");
        Product prod5 = new Product("Videogame",9,329.75,"VID12345");
        System.out.println(prod);
        System.out.println(prod1);
        System.out.println(prod2);
        System.out.println(prod3);
        System.out.println(prod4);
        System.out.println(prod5);
    }
}
