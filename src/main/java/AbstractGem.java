public abstract class AbstractGem implements Item{

    protected Item character;

    protected AbstractGem(Item character){
        this.character = character;
    }

    public abstract Integer getPower();

}
