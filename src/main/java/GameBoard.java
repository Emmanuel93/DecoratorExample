import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class GameBoard implements Board {


    private List<Slot> slots;

    private Slot [][] board;

    private final Integer length;

    private final Random random = new Random();

    private final Integer MAX_OF_GEMS = 3;

    public GameBoard( Integer length ){
        this.length = length;
        this.board = new Slot[length][length];
        fillBoard();
    }

    public void fillBoard(){
        Arrays.stream(board).forEach(i ->{
            Arrays.stream(i).forEach(j->{
                List<Power> gems = new ArrayList<>();

                for (int k = 0; k < random.nextInt(this.MAX_OF_GEMS); k++) {
                    int pick = random.nextInt( Gems.values().length );
                    gems.add( GemFactory.buildGem(Gems.values()[pick] ) );
                }

                j = new Slot(gems);
            });
        });

    }

    public String toString(){

        String result = "";
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                result += board[i][j].getGems().size() + "|";
            }
            result +="\n";
        }

        return result;
    }





}
