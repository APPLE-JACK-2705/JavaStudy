package lesson_01.enums;

public enum EnumClass {
    FIRST_VALUE("one"){

    },
    SECOND_VALUE("two"){
        public String getValue(){
            return "second";
        }
    },
    THIRD_VALUE("three"){
        public String getValue(){
            return "three";
        }
    };

    private String value;

    EnumClass(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }
}
