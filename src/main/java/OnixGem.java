public class OnixGem extends AbstractGem {

    public static final Integer POWER = 1;

    public OnixGem(){}

    public OnixGem(Character character){
        super(character);
    }

    @Override
    public Integer getPower() {
        return this.POWER + character.getPower();
    }
}
