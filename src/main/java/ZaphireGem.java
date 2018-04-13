public class ZaphireGem extends AbstractGem {

    public ZaphireGem(Integer power, Item character){
        super(power,character);

    }
    @Override
    public Integer getPower() {
        return this.power+ this.character.getPower();
    }
}
