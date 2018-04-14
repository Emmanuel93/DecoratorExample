public class DiamondGem extends AbstractGem{

    public static final Integer POWER = 8;

    public DiamondGem(){}

    public DiamondGem(Item character){
       super(character);
    }

    @Override
    public Integer getPower() {
        return this.POWER + character.getPower();
    }
}
