
/*
    Interface definida en caso de que necesitemos manejar mas tipos de
    jugadores, en caso de que ataquen a distancia etc.
    @author Emmanuel Hernandez
*/

public interface Character{

    public void fight(Character character);

    public boolean isAlive();

    public Integer getPower();

    public void setDice(Dice dice);

    public Integer showNumberOfDice();

    public String getName();

    public void setDamage(Integer damage);

    public Integer getDamage();

}
