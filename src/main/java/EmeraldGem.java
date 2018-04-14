public class EmeraldGem extends AbstractGem{

    public static final Integer POWER = 2;

    public EmeraldGem(){}

    public EmeraldGem(Character character){
        super(character);
    }
    @Override
    public Integer getPower() {
        return (this.POWER+ this.character.getPower())-getDamage();
    }
}
