public abstract class BaseGameCalculatorE9 {
    public abstract void calculate();
    //fonksiyona abstract ifadesi ekleyerek overwrite ı zorunlu kıldık.
    //Abstract classlardaki tüm fonksiyonlar abstract fonksiyon olmak zorunda değildir.
    //Yalnızca overwrite ı zorunlu kılmak istelinen fonksiyonlara eklenir.
    public void gameOver(){
        System.out.println("Game Over");
    }
}
