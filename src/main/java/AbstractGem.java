public abstract class AbstractGem implements Item{

    protected Integer power;

    protected Item character;

    protected AbstractGem(Integer power, Item character){
        this.power = power;
        this.character = character;
    }

    public abstract Integer getPower();

}
