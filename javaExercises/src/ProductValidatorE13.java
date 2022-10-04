public class ProductValidatorE13 {

    static {
        System.out.println("Statik yapıcı blok çalıştı");
    }

    //    static {
//        System.out.println("Statik yapıcı blok çalıştı");
//    }
    public ProductValidatorE13() {
        System.out.println("Blok çalıştı");
    }

    public void bişey() {

    }

    public static boolean isValid(ProductE13 productE13) {
        if (productE13.price > 0 && !productE13.name.isEmpty()) {
            return true;
        } else {
            return false;
        }

    }

//    //Inner Class
//    public static class BaskaBirClass(){
//        public static void sil(){
//
//        }
//
//    }
}
