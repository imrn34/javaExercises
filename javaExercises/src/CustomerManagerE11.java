public class CustomerManagerE11  {
    private ICustomerDalE11 iCustomerDalE11;
    public CustomerManagerE11(ICustomerDalE11 iCustomerDalE11){
        this.iCustomerDalE11=iCustomerDalE11;
    }

    public void add(){
        // iş kodları
    iCustomerDalE11.Add();
    }
}
