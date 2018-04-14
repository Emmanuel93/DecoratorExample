import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class GameBoard {


    private List<Slot> slots;

    private Integer length;

    public GameBoard(List<Slot> slots, Integer length ){
        this.slots = slots;
        this.length = length;
    }

    public void addSlot(int length){

        for(int i=1; i >=length; i++){

            Slot slot= new Slot(new LinkedList<>());
            slots.add(slot);
        }

    }

    public Slot getGameBoardSlot(int n){

        return slots.get(n);
    }

    public int RollDice(){
        int min=1;
        int max=3;
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);

        return randomNum;
    }





}
