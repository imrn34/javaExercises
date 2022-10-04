public class Exercise10 {
    public static void main(String[] args) {
        CustomerManagerE10 customerManagerE10 = new CustomerManagerE10();
        //  customerManagerE10.baseDatabaseManagerE10=new SqlServerDatabaseManagerE10()
        // customerManagerE10.baseDatabaseManagerE10=new OracleDatabaseManagerE10();
        customerManagerE10.baseDatabaseManagerE10=new MySqlDatabaseManagerE10();
        customerManagerE10.getCustomers();
    }
}
