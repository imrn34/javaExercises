public class Exercise13 {
    public static void main(String[] args) {
        ProductManagerE13 productManagerE13 = new ProductManagerE13();
        ProductE13 productE13 = new ProductE13();
        productE13.name = "Asus Notebook";
        productE13.price = 1250.2;

        productManagerE13.add(productE13);

    }
}
