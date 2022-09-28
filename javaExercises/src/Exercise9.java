//Abstract Classes
//**Önemli genellikle anlaşılması güç bir yapı.
public class Exercise9 {
    public static void main(String[] args) {
        FemaleGameCalculatorE9 femaleGameCalculatorE9 = new FemaleGameCalculatorE9();
        femaleGameCalculatorE9.calculate();
        femaleGameCalculatorE9.gameOver();

        BaseGameCalculatorE9 baseGameCalculatorE9 = new FemaleGameCalculatorE9();

    }
}
