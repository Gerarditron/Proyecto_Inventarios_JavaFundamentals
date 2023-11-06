package Products;

public class Product {
    //Variables
    private static int amountProducts = 0;
    private int idProduct;

    private String name;
    private int amount;
    private double price;
    private String code;

    //Constructores
    public Product(){
        name = "";
        amount = 0;
        price = 0.0;
        code = "";
        idProduct = amountProducts++;
    }

    public Product(String _name, int _amount, double _price, String _code){
        this();
        name = _name;
        amount = _amount;
        price = _price;
        code = _code;
    }

    //Getter y Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    //toString
    @Override
    public String toString() {
        return "----------------------------------------" +
                "\nItem Number \t: " + idProduct +
                "\nCode \t: " + code +
                "\nName \t: " + name +
                "\nQuantity in Stock \t: " + amount +
                "\nPrice \t: " + price;
    }

    //Metodos



}
