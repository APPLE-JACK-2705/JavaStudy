package lesson_5.generic_02;

public class Main_02_1 {
    public static void main(String[] args) {
        GenericBox<Lemon> box1 = new GenericBox<>();
        Lemon lemon = new Lemon();
        box1.put(lemon);

        openBoxAndGet(box1);

        GenericBox<Apple> box2 = new GenericBox<>();
        Apple apple = new Apple();
        box2.put(apple);

        //openBoxAndGet(box2);
    }

    public static void openBoxAndGet(GenericBox<Lemon> box){
        box.get();
    }
}
