package lesson_02;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ExceptionInfo {
    public static void main(String[] args) {
        // ArrayIndexOutOfBoundException
//        int[] arr = {1, 2, 3};
//        System.out.println(Arrays.toString(arr));
//        arr[1] = 8;
//        System.out.println(Arrays.toString(arr));
//        arr[6] = 30;
//        System.out.println(Arrays.toString(arr));

        // ClassCastException
//        Object obj = "svsvavavava";
//        System.out.println((Integer) obj);

        // NumberFormatException
//        Object line = "lvbsfjkvnsvpnslv";
//        System.out.println(Integer.parseInt((String)line));

        //NullPointerException
//        String line = null;
//        System.out.println(line.substring(4));

        //ArithmeticException
//        System.out.println(5 / 0);

//        try{
//            method1();
//        }catch (ArithmeticException e){
//            System.err.println("Деление на ноль");
//            e.printStackTrace();
//        }
//        System.out.println("-------------------");

        int[] array = {1, 2, 3};

        try{
            array[10] = 8;
            int a = 10 / 0;
        }catch (ArithmeticException arithmeticException){
            System.err.println("Деление на ноль");
            arithmeticException.printStackTrace();
        }catch (IndexOutOfBoundsException exception){
            System.err.println("Выход за границы массива");
            exception.printStackTrace();
        }
        System.out.println("-----------------");
    }

    private static void method1(){
        method2();
    }

    private static void method2() {
        method3();
    }

    private static void method3() {
        System.out.println(15 / 0);
    }
}
