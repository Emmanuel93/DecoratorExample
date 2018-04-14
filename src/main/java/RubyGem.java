public class RubyGem extends AbstractGem {

    public static final Integer POWER = 5;

    public RubyGem(){}

    public RubyGem(Character character){
        super(character);
    }

    @Override
    public Integer getPower() {
        return this.POWER + character.getPower();
    }
}
