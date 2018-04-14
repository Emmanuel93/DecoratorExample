public class DiamondGem extends AbstractGem{

    public static final Integer POWER = 8;

    public DiamondGem(){}

    public DiamondGem(Character character){
       super(character );
    }

    @Override
    public Integer getPower() {
        return (this.POWER+ this.character.getPower())-getDamage();
    }
}
