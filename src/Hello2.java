public class Hello2 {
    public  static  void main(String[] args){
    int a=5;
    int b=6;
        System.out.println(
                "Sum Of them: "+sum(a,b)+
                "\nMultiply Of them: "+multiple(a,b)+
                "\nSubtract Of them: "+sub(a,b)+
                "\nDivide Of them: "+divide(a,b)+
                "\nA Square is: "+square(a)+
                "\nB is: "+isEvenOrOdd(b)
        );
    }
    static int  sum(int a, int b){
        return a+b;
    }
    static int  multiple(int a, int b){
        return a*b;
    }
    static int  sub(int a, int b){
        return a-b;
    }
    static double  divide(double a, double b){
        return a/b;
    }
    static int  square(int a){
        return a*a;
    }
    static String isEvenOrOdd (int a){
        if (a%2==0) return "Even";
        else return  "Odd";
    }



}
