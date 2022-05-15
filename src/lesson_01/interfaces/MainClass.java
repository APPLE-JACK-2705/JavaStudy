package lesson_01.interfaces;

public class MainClass {
    public static void main(String[] args) {
        MyClass1 mc1 = new MyClass1(10, "text");
        Testable mc2 = new MyClass2();

//        mc1.testMethod();
//        mc2.testMethod();
//
//        System.out.println(mc1.testMethod2(4, "some text"));
//        System.out.println(mc2.testMethod2(5,"else text"));
//        System.out.println(mc1.testMethod3(2,5));
//        System.out.println(mc2.testMethod3(3,6));

        Testable[] testables = {mc1, mc2};

        for(Testable t : testables){
           t.testMethod();
           System.out.println(t.testMethod2(2,"adil"));
           System.out.println(t.testMethod3(5,7));
        }

        System.out.println(Testable.COUNT);
        System.out.println(Testable.MESSAGE);
        System.out.println(MyClass1.COUNT);
        System.out.println(MyClass2.MESSAGE);
    }
}
