//OverwritingDemo
public class Exercise8 {
    public static void main(String[] args) {
//    TeacherCreditManagerE8 teacherCreditManagerE8=new TeacherCreditManagerE8();
//    System.out.println(teacherCreditManagerE8.calculate(1000));
        BaseCreditManagerE8[] baseCreditManagerE8s = {new TeacherCreditManagerE8(), new FarmerCreditManagerE8(),new StudentCreditManagerE8()};
        for (BaseCreditManagerE8 baseCreditManagerE8 : baseCreditManagerE8s) {
            System.out.println(baseCreditManagerE8.calculate(1000));
        }
    }
}
