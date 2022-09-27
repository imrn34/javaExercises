public class Exercise3 {
    public static void main (String[] args){

        Product product=new Product(1,"Redmi Note 11",8,1086.5,"Night Blue");
//        product.set_id(5);
//        product.setName("Redmi Note 11 Pro");
//        product.setQuantity(8);
//        product.setPrice(1086.5);

        ProductManager productManager=new ProductManager();
        productManager.Add(product);
        System.out.println(product.getCode());


    }
}
