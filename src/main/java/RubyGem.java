public class RubyGem extends AbstractGem {

    public RubyGem(Integer power, Item character){
        super(power, character);
    }

    @Override
    public Integer getPower() {
        return this.power + character.getPower();
    }
}
