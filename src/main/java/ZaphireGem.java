public class ZaphireGem extends AbstractGem {

    public static final Integer POWER = 3;

    public ZaphireGem(){}

    public ZaphireGem(Item character){
        super(character);

    }
    @Override
    public Integer getPower() {
        return this.POWER+ this.character.getPower();
    }
}
