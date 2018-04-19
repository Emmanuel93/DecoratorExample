public class Warrior extends AbstractCharacter {


    public static final Integer POWER = 4;

    private Dice dice;

    public Warrior(String name){
       super(name);
    }

    @Override
    public Integer getPower() {
       Integer powerAux = this.POWER - getDamage();
       if( powerAux < 0)
           return 0;
       return powerAux;
    }

}
