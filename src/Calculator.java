public class Calculator {
    public static int plus(int a, int b) {
        //напишите тут ваш код
        return a + b;
    }

    public static int minus(int a, int b) {
        //напишите тут ваш код
        return a - b;
    }

    public static int multiply(int a, int b) {
        //напишите тут ваш код
        return a * b;
    }

    public static double division(double a, double b) {
        //напишите тут ваш код
        double result =  a / b;
        return result;
    }

    public static double percent(double a, double b) {
        //напишите тут ваш код
        double result = a * b / 100;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(percent(9, 50));
        System.out.println(division(10, 4));
    }
}
