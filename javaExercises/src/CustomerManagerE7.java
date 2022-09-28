public class CustomerManagerE7 {
   final private BaseLogger logger;

    public CustomerManagerE7(BaseLogger logger) {
        this.logger=logger;

    }

    public void add() {
        System.out.println("Customer added.");
        this.logger.log("Log Message");
    }
}
