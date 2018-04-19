
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

        if(!character.isAlive())
            System.out.println(character.getName()+" no puede jugar, esta muerto");

        try {

            Integer lastIndex = this.getIndexOfPlayerByName(character.getName());

            if(lastIndex>-1)
                System.out.println(character.getName() + " estaba en el slot: " + (lastIndex+1));
            System.out.println("Dado " + movement);
            System.out.println("ahora se encuentra en el slot: " + ((lastIndex+movement)+1));
            Character aux = this.board[lastIndex +movement].addCharacter(character);

            if(lastIndex > -1)
                ClearPlayerByName(character.getName(),lastIndex);



            if ((lastIndex+movement-1)==20){
                character.setWinner(true);
            }


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
        return -1;
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
                result +="Slot "+(i+1)+ ": G:" +board[i].getGems().size() +" P:"+ board[i].getCharacters().size()+"|\n";
        }

        return result;
    }


    public void beginGame(List<Character> characters){
        Integer deathcount = 0;
        System.out.println("Inicial");
        System.out.println(toString());
        mainLoop:
        while (true){

            List<Character> powereado = new ArrayList<>();

            for (Character character: characters) {

                if(character.isAlive()){

                    Integer movement = character.showNumberOfDice();
                    System.out.println(character.getName() + " tiene de poder: " + character.getPower());
                    character=this.addCharacter(character, movement);
                    powereado.add(character);
                    System.out.println(character.getName() + " tiene de poder: " + character.getPower());
                    System.out.println();
                    System.out.println(toString());
                    System.out.println();


                }else{
                    deathcount = deathcount + 1;
                }


                if(character.isWinner()){
                    System.out.println(character.getName()+" es el ganador del juego FELICIDADES!");
                    break mainLoop;
                }

            }
            characters=powereado;
        }
    }





}
