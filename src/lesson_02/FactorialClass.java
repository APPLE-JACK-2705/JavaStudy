package lesson_02;

public class FactorialClass {
    public static void main(String[] args) {
        try {
            System.out.println(getFactorial(5));
        } catch (FactorialException e) {
            e.printStackTrace();
        }finally {
            System.out.println("Вычисление факториала");
        }
        System.out.println("Correct finish");
    }

    public static int getFactorial(int n) throws FactorialException {
        int result = 1;
        if (n < 1){
            throw new FactorialException("Число не может быть меньше 1", n);
        }

        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
