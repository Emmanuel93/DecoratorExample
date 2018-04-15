
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

        if(character.isAlive()==false){
            System.out.println(character.getName()+" no puede jugar, esta muerto");

        }


        try {

            Integer lastIndex = this.getIndexOfPlayerByName(character.getName());
            System.out.println(character.getName() + " estaba en el slot: " + (lastIndex));
            System.out.println("ahora se encuentra en el slot: " + (lastIndex+movement-1));
            Character aux = this.board[lastIndex +(movement - 1)].addCharacter(character);

            System.out.println();
            System.out.println(toString());
            System.out.println();

            ClearPlayerByName(character.getName(),lastIndex);
            return aux;

        }catch (ArrayIndexOutOfBoundsException exception){
            character.setWinner(true);

        }

        return character;
    }

    public Integer getIndexOfPlayerByName(String name){
        for (int i = 0; i <this.board.length ; i++) {
            for (Character character : this.board[i].getCharacters()){
                if(character.getName().equals(name)){
                    return i;
                }

            }

        }
        return 0;
    }

    public void ClearPlayerByName(String name, int i){
        List<Character> found = new ArrayList<>();

            for (Character character : this.board[i].getCharacters()){
                if(character.getName().equals(name)){
                   found.add(character);


                }
            }

       this.board[i].getCharacters().removeAll(found);


    }




    public String toString(){

        String result = "";
        for (int i = 0; i < board.length; i++) {
                result +="Slot "+i+ ": G:" +board[i].getGems().size() +" P:"+ board[i].getCharacters().size()+"|\n";
        }

        return result;
    }


    public void beginGame(List<Character> characters){
        Integer deathcount = 0;
        mainLoop:
        while (true){
            for (Character character: characters) {

                if(character.isAlive()==false){
                    deathcount = deathcount + 1;

                }

                if(character.isAlive()==true){

                    if(deathcount==(characters.size()-1)){
                        System.out.println("los demas jugadores estan fuera del juego");
                        System.out.println(character.getName()+" es el ganador del juego FELICIDADES!");
                        break mainLoop;
                    }


                    Integer movement = character.showNumberOfDice();
                    character=this.addCharacter(character, movement);


                }


                if(character.isWinner()){
                    System.out.println(character.getName()+" es el ganador del juego FELICIDADES!");
                    break mainLoop;
                }

            }
        }
    }





}
