package lesson_01.interfaces;

import java.io.Serializable;

public interface Testable{
    String MESSAGE = "text message";
    int COUNT = 100000;

    void testMethod();
    String testMethod2(int value, String text);

    default int testMethod3(int a, int b){
        return a + b;
    }
}
