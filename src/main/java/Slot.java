import java.util.List;

public class Slot {

    private List<Slotable> gameElements;

    public Slot(List<Slotable> gameElements){
        this.gameElements = gameElements;
    }

    public void addGameElement(Slotable gameElement){

        this.gameElements.add(gameElement);
    }

    public void setGameElements(List<Slotable> gameElements) {
        this.gameElements = gameElements;
    }
}
