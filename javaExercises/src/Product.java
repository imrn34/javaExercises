public class Product {

    public Product(int id, String name, int quantity, double price, String color) {
        System.out.println("Yapıcı blok çalıştı.");
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.color = color;

    }

    private int id;
    private String name;
    private int quantity;
    private double price;
    private String color;
    String code;

    public int get_id() {
        return id;
    }

    public void set_id(int id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCode() {
        return this.name.substring(0, 1) + id;
    }


}
