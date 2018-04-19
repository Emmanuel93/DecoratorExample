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

    public boolean existWinner(){
       return this.characters
               .stream()
               .max(Comparator.comparing(character -> character.isWinner()))
               .get().isWinner();
    }

    public void fight(Character character1,Character character2) {
        if(character1.getPower()> character2.getPower()){
            System.out.println(character1.getName()+" ha ganado");
            character2.setDamage(character1.getPower()-character2.getPower());
            System.out.println(character2.getName()+" ha recibido "+character2.getDamage()+" de daño y queda con poder"+character2.getPower());
            if(character2.getPower()<1)
                character2.setAlive(false);
        }

        if(character2.getPower() > character1.getPower()){
            System.out.println(character1.getName()+" ha perdido");
            character1.setDamage(character2.getPower()-character1.getPower());
            System.out.println(character1.getName()+" ha recibido "+character1.getDamage()+" de daño y queda con poder"+character1.getPower());
            if(character1.getPower()<1)
                character1.setAlive(false);

        }

        if(character2.getPower() == character1.getPower()){
            System.out.println("hay empate");
        }


    }

    public Character addCharacter(Character character){


        character = takeAGems(character);

        Character characterStronger = getStrongerCharacter();

        if(characterStronger != null){

            System.out.println(character.getName()+" y "+characterStronger.getName()+ " estan peleando");

            System.out.println(characterStronger.getName() + " tiene de poder: " + characterStronger.getPower());

            this.fight(character,characterStronger);
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
