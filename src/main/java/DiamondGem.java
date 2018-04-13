public class DiamondGem extends AbstractGem{

    public DiamondGem(Integer power, Item character){
       super(power,character);
    }

    @Override
    public Integer getPower() {
        return this.power + character.getPower();
    }
}
