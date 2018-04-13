import org.junit.Test;

import static junit.framework.TestCase.assertTrue;


public class TestWarrior {

    private Item warrior;

    public TestWarrior(){
        this.warrior = new Warrior("Emmanuel",4);
    }

    @Test
    public void verifyPowerOfWarriorAndOnixGem(){
        this.warrior = new OnixGem(1, this.warrior);
        assertTrue( 5 == warrior.getPower());
    }

    @Test
    public void verifyPowerOfWarriorAndZaphireGem(){
        this.warrior = new ZaphireGem(3, this.warrior);
        assertTrue( 7 == warrior.getPower());
    }

    @Test
    public void verifyPowerOfWarriorAndRubyGem(){
        this.warrior = new RubyGem(5, this.warrior);
        assertTrue( 9 == warrior.getPower());
    }

    @Test
    public void verifyPowerOfWarriorAndEmeraldGem(){
        this.warrior = new EmeraldGem(2, this.warrior);
        assertTrue( 6 == warrior.getPower());
    }

    @Test
    public void verifyPowerOfWarriorAndDiamondGem(){
        this.warrior = new DiamondGem(8, this.warrior);
        assertTrue( 12 == warrior.getPower());
    }

}
