public abstract class AbstractGem implements Character{

    protected Character character;

    protected Integer power;

    protected AbstractGem(){

    }

    protected AbstractGem(Character character,Integer power){
        this.character = character;
        this.power = power;
    }

    public void setDamage(Integer damage){
        character.setDamage(damage);
    }

    public Integer getPower(){
        return (character.getPower() + this.power)+this.getDamage();
    }

    @Override
    public String toString() {
        return ""+this.getPower();
    }

    @Override
    public String getName() {
       return character.getName();
    }

    @Override
    public Integer getDamage() {
        return character.getDamage();
    }

    public void setAlive(boolean isAlive){
        this.character.setAlive(isAlive);
    }

    public boolean isAlive(){
        return this.character.isAlive();
    }

    public void setDice(Dice dice){
        this.character.setDice(dice);
    }

    public Integer showNumberOfDice(){
        return this.character.showNumberOfDice();
    }

    public void setWinner(boolean winner) {
        this.character.setWinner(winner);
    }

    public boolean isWinner() {
        return this.character.isWinner();
    }

}
