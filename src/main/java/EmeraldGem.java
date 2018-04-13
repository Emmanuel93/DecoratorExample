public class EmeraldGem extends AbstractGem{

    public EmeraldGem(Integer power, Item character){
        super(power,character);
    }
    @Override
    public Integer getPower() {
        return this.power + character.getPower();
    }
}
