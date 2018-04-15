public abstract class AbstractCharacter implements Character{

    protected boolean isAlive = true;

    protected String name;

    protected Integer damage=0;

    protected boolean isWinner=false;

    protected Dice dice;

    public void setWinner(boolean winner) {
        this.isWinner = winner;
    }

    public boolean isWinner() {
        return this.isWinner;
    }

    public void setDamage(Integer damage){
        this.damage = damage;
    }

    public Integer getDamage() {
        return this.damage;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setDice(Dice dice){
        this.dice = dice;
    }

    public Integer showNumberOfDice(){
        return this.dice.showNumber();
    }

    protected AbstractCharacter(String name){
        this.name = name;
    }

    public abstract void fight(Character character);

    public boolean isAlive(){
        return this.isAlive;
    }

}
