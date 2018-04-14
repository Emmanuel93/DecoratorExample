public class Warrior extends AbstractCharacter {


    public static final Integer POWER = 4;

    public Warrior(String name){
       super(name);
    }

    @Override
    public void atack(Character character) {
        System.out.println("El warrior esta atacando!" + this.getPower());
    }

    @Override
    public void move(Slot slot) {

    }

    @Override
    public void takeAPower(Slot slot) {

    }

    @Override
    public Integer getPower() {
        return this.POWER;
    }
}
