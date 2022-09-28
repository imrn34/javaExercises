//PolimorphismDemo
public class Exercise7 {
    public static void main(String[] args) {
//        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DatabaseLogger(), new ConsoleLogger()};
//        for (BaseLogger logger : loggers) {
//            logger.Log("Log message");
//        }

        CustomerManagerE7 customerManagerE7 = new CustomerManagerE7(new DatabaseLogger());
        customerManagerE7.add();
    }
}
