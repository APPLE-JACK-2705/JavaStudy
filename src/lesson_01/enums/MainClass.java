package lesson_01.enums;

public class MainClass {
    public static void main(String[] args) {
//        System.out.println(EnumClass.FIRST_VALUE.getValue());
//        System.out.println(EnumClass.SECOND_VALUE.getValue());
//        System.out.println(EnumClass.FIRST_VALUE.ordinal());
//
//        EnumClass[] enumArray = EnumClass.values();
//        for(EnumClass e : enumArray){
//            System.out.println(e.getValue());
//        }

        MonthsEnum[] enumArray = MonthsEnum.values();
        for(MonthsEnum me : enumArray){
            System.out.println(me.getTranslate() + " - " + me.name() + ": " + me.getNumber());
        }
    }
}
