public class Warrior extends AbstractCharacter {


    public static final Integer POWER = 4;

    private Dice dice;

    public Warrior(String name){
       super(name);
    }

    @Override
    public void fight(Character character) {
        if(this.getPower()> character.getPower())
            character.setDamage(this.getPower()-character.getPower());
        if(character.getPower() > this.getPower())
            this.setDamage(character.getPower()-this.getPower());

    }

    @Override
    public Integer getPower() {
        return this.POWER;
    }


    @Override
    public boolean isAlive() {
        if(this.getPower()<=this.getDamage()){

            return false;
        }else

        return super.isAlive();
    }
}
