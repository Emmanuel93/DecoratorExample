import java.util.*;

public class Slot {

    private List<Gems> gems = new ArrayList<>();

    private List<Character> characters = new ArrayList<>();

    public Slot(List<Gems> gems){
        this.gems = gems;
    }


    public List<Gems> getGems() {
        return this.gems;
    }

    public Character getStrongerCharacter(){
        return this.characters.stream()
                        .max(Comparator.comparing(Character::getPower))
                        .orElse(null);
    }

    public Character addCharacter(Character character){
        character = takeAGems(character);

        Character characterStronger = getStrongerCharacter();

        if(characterStronger != null){
            character.fight(characterStronger);
        }

        this.characters.add(character);

        return character;

    }

    public Character takeAGems(Character character){
        for (Gems gem:this.gems){
            character = GemFactory.buildGem(gem,character);
        }

        this.gems = new ArrayList<>();
        return character;
    }

    public List<Character> getCharacters() {
        return this.characters;
    }
}
