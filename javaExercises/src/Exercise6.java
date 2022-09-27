//inheritance Demo
//Polyphormism
public class Exercise6 {
    public static void main(String[] args) {
       // TeacherCreditManager teacherCreditManager=new TeacherCreditManager();
       // FarmerCreditManager farmerCreditManager=new FarmerCreditManager();

        CreditUI creditUI=new CreditUI();
        creditUI.CalculateCredit(new TeacherCreditManager());
        creditUI.CalculateCredit(new SoldierCreditManager());

    }
}
