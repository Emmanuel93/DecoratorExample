import java.util.ArrayList;
import java.util.List;

public class Slot {

    private List<Gems> gems = new ArrayList<>();

    private List<Character> characters = new ArrayList<>();

    public Slot(List<Gems> gems){
        this.gems = gems;
    }


    public List<Gems> getGems() {
        return this.gems;
    }


    public List<Character> getCharacters() {
        return this.characters;
    }
}
