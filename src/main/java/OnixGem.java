public class OnixGem extends AbstractGem {

    public OnixGem(Integer power, Item character){
        super(power,character);
    }

    @Override
    public Integer getPower() {
        return this.power + character.getPower();
    }
}
