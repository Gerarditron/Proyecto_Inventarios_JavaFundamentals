package Products;

public class Product {
    //Variables
    private static int amountProducts = 0;
    private int idProduct;
    private String name;
    private int amount;
    private double price;
    private String code;
    private boolean productStatus;

    //Constructores
    public Product(){
        name = "";
        amount = 0;
        price = 0.0;
        code = "";
        productStatus = true;
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

    public boolean isProductStatus() {
        return productStatus;
    }

    public void setProductStatus(boolean productStatus) {
        this.productStatus = productStatus;
    }

    //toString
    @Override
    public String toString() {

        String _status = productStatus == true ? "Activo": "Descatalogado";

        return "----------------------------------------" +
                "\nItem Number \t: " + idProduct +
                "\nCode \t: " + code +
                "\nName \t: " + name +
                "\nQuantity in Stock \t: " + amount +
                "\nPrice \t: " + price +
                "\nStock Value \t: " + getInventoryValue() +
                "\nProduct Status \t: " + _status +
                "\n-----------------------------------------" ;
    }

    //Metodos
    public double getInventoryValue(){
        return this.price*this.amount;
    }


}
