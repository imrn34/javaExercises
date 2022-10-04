//Interface Demo
public class Exercise11 {
    public static void main(String[] args) {
        // ICustomerDalE11 iCustomerDalE11=new OracleCustomerDalE11();
        CustomerManagerE11 customerManagerE11 = new CustomerManagerE11(new MySqlCustomerDalE11());
        //customerManagerE11.iCustomerDalE11 = new OracleCustomerDalE11();
       // customerManagerE11.iCustomerDalE11 = new MySqlCustomerDalE11();
        customerManagerE11.add();
    }
}
