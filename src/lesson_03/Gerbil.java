package lesson_03;

public class Gerbil {
    private int gerbilNumber;

    Gerbil(int gerbilNumber){
        this.gerbilNumber = gerbilNumber;
    }

    public String hop(){
        return "This is gerbil number - " + gerbilNumber;
    }
}
