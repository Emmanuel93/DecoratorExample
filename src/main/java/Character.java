
/*
    Interface definida en caso de que necesitemos manejar mas tipos de
    jugadores, en caso de que ataquen a distancia etc.
    @author Emmanuel Hernandez
*/

public interface Character{

    public void atack(Character character);

    public void move(Slot slot);

    public void takeAPower(Slot slot);

    public boolean isAlive();

    public Integer getPower();

}
