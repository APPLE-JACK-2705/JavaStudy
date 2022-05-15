package lesson_01.enums;

public enum MonthsEnum {
    JANUARY("Январь", 1),
    FEBRUARY("Февраль", 2),
    MARCH("Март", 3),
    APRIL("Апрель", 4),
    MAY("Май", 5),
    JUNE("Июнь", 6),
    JULY("Июль", 7),
    AUGUST("Август", 8),
    SEPTEMBER("Сентябрь", 9),
    OCTOBER("Октябрь", 10),
    NOVEMBER("Ноябрь", 11),
    DECEMBER("Декабрь", 12);

    private String Translate;
    private int Number;

    MonthsEnum(String Translate, int Number) {
        this.Translate = Translate;
        this.Number = Number;
    }

    public String getTranslate(){
        return Translate;
    }

    public int getNumber(){
        return Number;
    }
}
