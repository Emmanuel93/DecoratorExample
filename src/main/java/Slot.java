import java.util.List;

public class Slot {

    private List<Power> gems;

    public Slot(List<Power> gems){
        this.gems = gems;
    }


    public List<Power> getGems() {
        return this.gems;
    }


}
