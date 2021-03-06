package lesson_5.wildcard_02;

public class Main_03 {
    public static void main(String[] args) {
        GenericBox<Lemon> box1 = new GenericBox<>();
        GenericBox<Apple> box2 = new GenericBox<>();
        GenericBox<String> box3 = new GenericBox<>();

        box1.put(new Lemon());
        openBoxAndGet2(box1);

        box2.put(new Apple());
        openBoxAndGet2(box2);

        box3.put(new String());
        openBoxAndGet(box3);
    }

    public static void openBoxAndGet(GenericBox<?> box){
        box.get();
    }

    public static void openBoxAndGet2(GenericBox<? extends Product> box){
        box.get();
    }
}
