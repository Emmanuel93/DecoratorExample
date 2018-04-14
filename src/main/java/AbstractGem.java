public abstract class AbstractGem implements Item{

    protected Integer power;

    protected Item character;

    protected AbstractGem(Integer power, Item character){
        this.power = power;
        this.character = character;
    }

    /*protected AbstractGem(Integer power){
        this.power=power;
    }*/

    public abstract Integer getPower();

}
