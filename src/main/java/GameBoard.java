import com.sun.tools.corba.se.idl.InterfaceGen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GameBoard {


    private List<Slot> slots;

    private Slot [] board;

    private final Integer length;

    private final Random random = new Random();

    private final Integer MAX_OF_GEMS = 3;

    public GameBoard( Integer length ){
        this.length = length;
        this.board = new Slot[length];
        fillBoard();
    }

    private void fillBoard(){

        for (int i = 0; i <board.length ; i++) {
            List<Gems> gems = new ArrayList<>();
            for (int k = 0; k < random.nextInt(this.MAX_OF_GEMS+1); k++) {
                int pick = random.nextInt( Gems.values().length );
                gems.add( Gems.values()[pick]  );
            }
            board[i] = new Slot(gems);
        }

    }

    public Character addCharacter(Character character, Integer movement){

        try {
            Character aux = this.board[movement - 1].addCharacter(character);
            return aux;
        }catch (ArrayIndexOutOfBoundsException exception){
            character.setWinner(true);
        }

        return character;
    }

    public String toString(){

        String result = "";
        for (int i = 0; i < board.length; i++) {
                result += "G" +board[i].getGems().size() +" P"+ board[i].getCharacters().size()+"|";
        }

        return result;
    }

    public void beginGame(List<Character> characters){
        mainLoop:
        while (true){
            for (Character character: characters) {
                Integer movement = character.showNumberOfDice();
                this.addCharacter(character, movement);
                if(character.isWinner())
                    break mainLoop;
            }
        }
    }

}
