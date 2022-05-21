package lesson_04;

public class Counter {
    int c;

    public Counter(int c) {
        this.c = c;
    }

    public int getC() {
        return c;
    }

    public void incC(){
        this.c++;
    }

    public void decC(){
        this.c--;
    }
}
