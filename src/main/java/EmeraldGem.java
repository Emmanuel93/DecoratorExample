public class EmeraldGem extends AbstractGem{

    public static final Integer POWER = 2;

    public EmeraldGem(Item character){
        super(character);
    }
    @Override
    public Integer getPower() {
        return this.POWER + character.getPower();
    }
}
