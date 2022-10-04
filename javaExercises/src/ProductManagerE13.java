public class ProductManagerE13 {
    public void add(ProductE13 productE13) {
        //  ProductValidatorE13 productValidatorE13 = new ProductValidatorE13();
        if (ProductValidatorE13.isValid(productE13)) {
            System.out.println("Eklendi");
        } else {
            System.out.println("Eklenmedi");
        }

        //  ProductValidatorE13 productValidatorE13=new ProductValidatorE13();
        //  productValidatorE13.bişey();
    }
}
