import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static junit.framework.TestCase.assertTrue;


public class TestWarrior {

    private Character warrior;

    public TestWarrior(){
        this.warrior = new Warrior("Emmanuel");
    }

    @Test
    public void verifyPowerOfWarriorAndOnixGem(){
        this.warrior = new OnixGem(this.warrior);
        assertTrue( 5 == warrior.getPower());
    }

    @Test
    public void verifyPowerOfWarriorAndOnixGemAndOnixGem(){
        this.warrior = new OnixGem(this.warrior);
        this.warrior = new OnixGem(this.warrior);
        assertTrue( 6 == warrior.getPower());
    }

    @Test
    public void verifyPowerOfWarriorAndOnixGemAndOnixGemAndEmeraldGem(){
        this.warrior = new OnixGem(this.warrior);
        this.warrior = new OnixGem(this.warrior);
        this.warrior = new EmeraldGem(this.warrior);
        assertTrue( 8 == warrior.getPower());
    }

    @Test
    public void verifyPowerOfWarriorAndOnixGemAndOnixGemAndEmeraldGemAndZaphireGem(){
        this.warrior = new OnixGem(this.warrior);
        this.warrior = new OnixGem(this.warrior);
        this.warrior = new EmeraldGem(this.warrior);
        this.warrior = new ZaphireGem(this.warrior);
        assertTrue( 11 == warrior.getPower());
    }

    @Test
    public void verifyPowerOfWarriorAndOnixGemAndOnixGemAndEmeraldGemAndZaphireGemAndRubyGem(){
        this.warrior = new OnixGem(this.warrior);
        this.warrior = new OnixGem(this.warrior);
        this.warrior = new EmeraldGem(this.warrior);
        this.warrior = new ZaphireGem(this.warrior);
        this.warrior = new RubyGem(this.warrior);
        assertTrue( 16 == warrior.getPower());
    }

    @Test
    public void verifyPowerOfWarriorAndOnixGemAndOnixGemAndEmeraldGemAndZaphireGemAndRubyGemAndDiamondGem(){
        this.warrior = new OnixGem(this.warrior);
        this.warrior = new OnixGem(this.warrior);
        this.warrior = new EmeraldGem(this.warrior);
        this.warrior = new ZaphireGem(this.warrior);
        this.warrior = new RubyGem(this.warrior);
        this.warrior = new DiamondGem(this.warrior);
        assertTrue( 24 == warrior.getPower());
    }

    @Test
    public void verifyPowerOfWarriorAndEmeraldGem(){
        this.warrior = new EmeraldGem(this.warrior);
        assertTrue( 6 == warrior.getPower());
    }

    @Test
    public void verifyPowerOfWarriorAndEmeraldGemAndOnixGem(){
        this.warrior = new EmeraldGem(this.warrior);
        this.warrior = new OnixGem(this.warrior);
        assertTrue( 7 == warrior.getPower());
    }

    @Test
    public void verifyPowerOfWarriorAndEmeraldGemAndOnixGemAndEmeraldGem(){
        this.warrior = new EmeraldGem(this.warrior);
        this.warrior = new OnixGem(this.warrior);
        this.warrior = new EmeraldGem(this.warrior);
        assertTrue( 9 == warrior.getPower());
    }

    @Test
    public void verifyPowerOfWarriorAndEmeraldGemAndOnixGemAndEmeraldGemAndZaphireGem(){
        this.warrior = new EmeraldGem(this.warrior);
        this.warrior = new OnixGem(this.warrior);
        this.warrior = new EmeraldGem(this.warrior);
        this.warrior = new ZaphireGem( this.warrior);
        assertTrue( 12 == warrior.getPower());
    }

    @Test
    public void verifyPowerOfWarriorAndEmeraldGemAndOnixGemAndEmeraldGemAndZaphireGemAndRubyGem(){
        this.warrior = new EmeraldGem(this.warrior);
        this.warrior = new OnixGem(this.warrior);
        this.warrior = new EmeraldGem(this.warrior);
        this.warrior = new ZaphireGem( this.warrior);
        this.warrior = new RubyGem(this.warrior);
        assertTrue( 17 == warrior.getPower());
    }

    @Test
    public void verifyPowerOfWarriorAndEmeraldGemAndOnixGemAndEmeraldGemAndZaphireGemAndRubyGemAndDiamondGem(){
        this.warrior = new EmeraldGem(this.warrior);
        this.warrior = new OnixGem(this.warrior);
        this.warrior = new EmeraldGem(this.warrior);
        this.warrior = new ZaphireGem( this.warrior);
        this.warrior = new RubyGem(this.warrior);
        this.warrior = new DiamondGem(this.warrior);
        assertTrue( 25 == warrior.getPower());
    }



    @Test
    public void verifyPowerOfWarriorAndZaphireGem(){
        this.warrior = new ZaphireGem( this.warrior);
        assertTrue( 7 == warrior.getPower());
    }

    @Test
    public void verifyPowerOfWarriorAndZaphireGemAndOnix(){
        this.warrior = new ZaphireGem( this.warrior);
        this.warrior = new OnixGem(this.warrior);

        assertTrue( 8 == warrior.getPower());
    }

    @Test
    public void verifyPowerOfWarriorAndZaphireGemAndOnixAndEmeraldGem(){
        this.warrior = new ZaphireGem( this.warrior);
        this.warrior = new OnixGem(this.warrior);
        this.warrior = new EmeraldGem(this.warrior);
        assertTrue( 10 == warrior.getPower());
    }

    @Test
    public void verifyPowerOfWarriorAndZaphireGemAndOnixAndEmeraldGemAndZaphireGem(){
        this.warrior = new ZaphireGem( this.warrior);
        this.warrior = new OnixGem(this.warrior);
        this.warrior = new EmeraldGem(this.warrior);
        this.warrior = new ZaphireGem( this.warrior);
        assertTrue( 13 == warrior.getPower());
    }

    @Test
    public void verifyPowerOfWarriorAndZaphireGemAndOnixAndEmeraldGemAndZaphireGemAndRubyGem(){
        this.warrior = new ZaphireGem( this.warrior);
        this.warrior = new OnixGem(this.warrior);
        this.warrior = new EmeraldGem(this.warrior);
        this.warrior = new ZaphireGem( this.warrior);
        this.warrior = new RubyGem(this.warrior);
        assertTrue( 18 == warrior.getPower());
    }

    @Test
    public void verifyPowerOfWarriorAndZaphireGemAndOnixAndEmeraldGemAndZaphireGemAndRubyGemAndDiamondGem(){
        this.warrior = new ZaphireGem( this.warrior);
        this.warrior = new OnixGem(this.warrior);
        this.warrior = new EmeraldGem(this.warrior);
        this.warrior = new ZaphireGem( this.warrior);
        this.warrior = new RubyGem(this.warrior);
        this.warrior = new DiamondGem(this.warrior);
        assertTrue( 26 == warrior.getPower());
    }


    @Test
    public void verifyPowerOfWarriorAndRubyGem(){
        this.warrior = new RubyGem(this.warrior);
        assertTrue( 9 == warrior.getPower());
    }

    @Test
    public void verifyPowerOfWarriorAndRubyGemAndOnixGem(){
        this.warrior = new RubyGem(this.warrior);
        this.warrior = new OnixGem(this.warrior);
        assertTrue( 10 == warrior.getPower());
    }

    @Test
    public void verifyPowerOfWarriorAndRubyGemAndOnixGemAndEmeraldGem(){
        this.warrior = new RubyGem(this.warrior);
        this.warrior = new OnixGem(this.warrior);
        this.warrior = new EmeraldGem(this.warrior);
        assertTrue( 12 == warrior.getPower());
    }

    @Test
    public void verifyPowerOfWarriorAndRubyGemAndOnixGemAndEmeraldGemAndZaphireGem(){
        this.warrior = new RubyGem(this.warrior);
        this.warrior = new OnixGem(this.warrior);
        this.warrior = new EmeraldGem(this.warrior);
        this.warrior = new ZaphireGem( this.warrior);
        assertTrue( 15 == warrior.getPower());
    }

    @Test
    public void verifyPowerOfWarriorAndRubyGemAndOnixGemAndEmeraldGemAndZaphireGemAndRubyGem(){
        this.warrior = new RubyGem(this.warrior);
        this.warrior = new OnixGem(this.warrior);
        this.warrior = new EmeraldGem(this.warrior);
        this.warrior = new ZaphireGem( this.warrior);
        this.warrior = new RubyGem(this.warrior);
        assertTrue( 20 == warrior.getPower());
    }

    @Test
    public void verifyPowerOfWarriorAndRubyGemAndOnixGemAndEmeraldGemAndZaphireGemAndRubyGemAndDiamondGem(){
        this.warrior = new RubyGem(this.warrior);
        this.warrior = new OnixGem(this.warrior);
        this.warrior = new EmeraldGem(this.warrior);
        this.warrior = new ZaphireGem( this.warrior);
        this.warrior = new RubyGem(this.warrior);
        this.warrior = new DiamondGem(this.warrior);
        assertTrue( 28 == warrior.getPower());
    }

    @Test
    public void verifyPowerOfWarriorAndDiamondGem(){
        this.warrior = new DiamondGem(this.warrior);
        assertTrue( 12 == warrior.getPower());
    }

    @Test
    public void verifyPowerOfWarriorAndDiamondGemAndOnixGem(){
        this.warrior = new DiamondGem(this.warrior);
        this.warrior = new OnixGem(this.warrior);
        assertTrue( 13 == warrior.getPower());
    }

    @Test
    public void verifyPowerOfWarriorAndDiamondGemAndOnixGemAndEmeraldGem(){
        this.warrior = new DiamondGem(this.warrior);
        this.warrior = new OnixGem(this.warrior);
        this.warrior = new EmeraldGem(this.warrior);
        assertTrue( 15 == warrior.getPower());
    }

    @Test
    public void verifyPowerOfWarriorAndDiamondGemAndOnixGemAndEmeraldGemAndZaphireGem(){
        this.warrior = new DiamondGem(this.warrior);
        this.warrior = new OnixGem(this.warrior);
        this.warrior = new EmeraldGem(this.warrior);
        this.warrior = new ZaphireGem( this.warrior);
        assertTrue( 18 == warrior.getPower());
    }

    @Test
    public void verifyPowerOfWarriorAndDiamondGemAndOnixGemAndEmeraldGemAndZaphireGemAndRubyGem(){
        this.warrior = new DiamondGem(this.warrior);
        this.warrior = new OnixGem(this.warrior);
        this.warrior = new EmeraldGem(this.warrior);
        this.warrior = new ZaphireGem( this.warrior);
        this.warrior = new RubyGem(this.warrior);
        assertTrue( 23 == warrior.getPower());
    }

    @Test
    public void verifyPowerOfWarriorAndDiamondGemAndOnixGemAndEmeraldGemAndZaphireGemAndRubyGemAndDiamond(){
        this.warrior = new DiamondGem(this.warrior);
        this.warrior = new OnixGem(this.warrior);
        this.warrior = new EmeraldGem(this.warrior);
        this.warrior = new ZaphireGem( this.warrior);
        this.warrior = new RubyGem(this.warrior);
        this.warrior = new DiamondGem(this.warrior);
        assertTrue( 31 == warrior.getPower());
    }

    //@Test
    public void verifyFillBoard(){
        GameBoard board = new GameBoard(10);

        Dice dice = Dice.getInstance();

        Character emmanuel = new Warrior("Emmanuel");
        emmanuel.setDice(dice);

        Character brandon = new Warrior("Brandon");

        Integer Movement = dice.showNumber();
        System.out.println(board);
        emmanuel = board.addCharacter(emmanuel,2);
        System.out.println(board);
        System.out.println("Emmanuel tiene de poder"+ emmanuel.getPower());
        System.out.println("Emmanuel tiene de daño"+ emmanuel.getDamage());
        brandon = board.addCharacter(brandon,2);
        System.out.println("Brandon tiene de poder"+ brandon.getPower());
        System.out.println("Brandon tiene de daño"+ brandon.getDamage());
        System.out.println(board);



    }

    //@Test
    public void verifyTurnBoard(){

        System.out.println();
        System.out.println("test de turnos mediante iterador");
        GameBoard board = new GameBoard(10);
        Dice dice = Dice.getInstance();
        Integer Movement = dice.showNumber();

        Character emmanuel = new Warrior("Emmanuel");
        emmanuel.setDice(dice);

        Character brandon = new Warrior("Brandon");
        brandon.setDice(dice);

        Character jose = new Warrior("jose");
        jose.setDice(dice);

        List<Character> characterList = new LinkedList<>();
        characterList.add(emmanuel);
        characterList.add(brandon);
        characterList.add(jose);

        for(int i=1; i<=2; i++) {
            for (Character it : characterList) {

                boolean isalive = it.isAlive();

                if(isalive==true) {

                    it = board.addCharacter(it, it.showNumberOfDice());
                    System.out.println(board);

                    System.out.println(it.getName() + " tiene de poder" + it.getPower());
                    System.out.println(it.getName() + " tiene de daño" + it.getDamage());
                }



            }
        }


    }

    @Test
    public void verifyFight(){
        GameBoard board = new GameBoard(10);

        Dice dice = Dice.getInstance();

        Character emmanuel = new Warrior("Emmanuel");
        emmanuel.setDice(dice);

        Character brandon = new Warrior("Brandon");

        Integer Movement = dice.showNumber();

        emmanuel = board.addCharacter(emmanuel,2);
        brandon = board.addCharacter(brandon,1);
        System.out.println("Emmanuel tiene de poder"+ emmanuel.getPower());
        System.out.println("Emmanuel tiene de daño"+ emmanuel.getDamage());

        System.out.println("Brandon tiene de poder"+ brandon.getPower());
        System.out.println("Brandon tiene de daño"+ brandon.getDamage());


        System.out.println("Emanuel pelea directamente con brandon");
        emmanuel.fight(brandon);

        System.out.println("Emmanuel tiene de poder"+ emmanuel.getPower());
        System.out.println("Emmanuel tiene de daño"+ emmanuel.getDamage());

        System.out.println("Brandon tiene de poder"+ brandon.getPower());
        System.out.println("Brandon tiene de daño"+ brandon.getDamage());

        System.out.println("brandon se mueve en donde se encuentra emmanuel");
        brandon = board.addCharacter(brandon,2);

        System.out.println("Emmanuel tiene de poder"+ emmanuel.getPower());
        System.out.println("Emmanuel tiene de daño"+ emmanuel.getDamage());

        System.out.println("Brandon tiene de poder"+ brandon.getPower());
        System.out.println("Brandon tiene de daño"+ brandon.getDamage());


       System.out.println(brandon.getName()+" esta vivo "+brandon.isAlive());
       System.out.println(emmanuel.getName()+" esta vivo "+emmanuel.isAlive());






    }






    }



