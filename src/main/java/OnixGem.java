public class OnixGem extends AbstractGem {

    public final Integer POWER = 1;

    public OnixGem(Item character){
        super(character);
    }

    @Override
    public Integer getPower() {
        return this.POWER + character.getPower();
    }
}
