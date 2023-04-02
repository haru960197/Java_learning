package calcapp.main;
import calcapp.logics.CalcLogic;

public class Calc {
    public static void main(String[] args) {
        System.out.println("Input two int nums.");
        int a = new java.util.Scanner(System.in).nextInt();
        int b = new java.util.Scanner(System.in).nextInt();
        int plus = CalcLogic.plusInt(a, b);
        System.out.println("a + b = " + plus);
        int minus = CalcLogic.minusInt(a, b);
        System.out.println("a - b = " + minus);
    }
}
