
import java.util.ArrayList;
import java.util.List;

public class Aplication {

    public static void main(String[] args){


        GameBoard board = new GameBoard(20);

        Dice dice = Dice.getInstance();

        List<Character> characters = new ArrayList<>();

        Character emmanuel = new Warrior("Emmanuel");
        emmanuel.setDice(dice);
        characters.add(emmanuel);

        Character brandon = new Warrior("Brandon");
        brandon.setDice(dice);
        characters.add(brandon);

        Character jose = new Warrior("Jose");
        jose.setDice(dice);
        characters.add(jose);

        board.beginGame(characters);
    }

}
