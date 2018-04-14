public abstract class AbstractGem implements Item,Power{

    protected Item character;

    protected AbstractGem(){

    }

    protected AbstractGem(Item character){
        this.character = character;
    }

    public abstract Integer getPower();

    @Override
    public String toString() {
        return ""+this.getPower();
    }
}
