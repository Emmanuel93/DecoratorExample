public abstract class AbstractCharacter implements Character{

    protected boolean isAlive = false;

    protected String name;

    protected AbstractCharacter(String name){
        this.name = name;
    }

    public abstract void atack(Character character);

    public abstract void move(Slot slot);

    public abstract void takeAPower(Slot slot);

    public boolean isAlive(){
        return this.isAlive;
    }

}
