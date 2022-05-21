package lesson_5.method_04;

public class Main_04 {
    public static void main(String[] args) {
        Box<Fruit> boxFruit = new Box<>();
        Box<Apple> boxApple = new Box<>();

        boxApple.set(new Apple());
        merge(boxFruit, boxApple);
        System.out.println(boxFruit.get());
    }

    private static <M, N extends M> void merge(Box<M> boxFruit, Box<N> boxApple) {
        boxFruit.set(boxApple.get());
    }

    public static <T> void print(T value){
        System.out.println(value);
    }
}
