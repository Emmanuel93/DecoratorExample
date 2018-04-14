import org.junit.Test;

import static junit.framework.TestCase.assertTrue;


public class TestWarrior {

    private Item warrior;

    public TestWarrior(){
        this.warrior = new Warrior("Emmanuel",4);
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


}
