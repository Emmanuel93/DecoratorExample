public abstract class AbstractGem implements Character{

    protected Character character;

    protected AbstractGem(){

    }

    protected AbstractGem(Character character){
        this.character = character;
    }

    public abstract Integer getPower();

    @Override
    public String toString() {
        return ""+this.getPower();
    }

    public void atack(Character character){
        throw  new UnsupportedOperationException("Esta es una gema no puede atacar");
    };

    public void move(Slot slot){
        throw  new UnsupportedOperationException("Esta es una gema no puede mover");
    }

    public void takeAPower(Slot slot){
        throw  new UnsupportedOperationException("Esta es una gema no puede tomar poder");
    }

    public boolean isAlive(){
        throw  new UnsupportedOperationException("Esta es una gema no se definio funcionalidad");
    }

}
