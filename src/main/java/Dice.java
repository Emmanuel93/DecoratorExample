import java.util.Random;

public class Dice {

    Random random;

    private static Dice dice;

    private static Integer NUM_OF_FACES_OF_DICE = 2;

    public static Dice getInstance(){
        if(dice == null)
            return dice = new Dice();
        return dice;
    }

    private Dice(){
        random = new Random();
    }

    public Integer showNumber(){
        return random.nextInt(NUM_OF_FACES_OF_DICE) +1;
    }

}
