public class Warrior extends AbstractCharacter {


    public Warrior(String name, Integer power){
       super(name,power);
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
        return this.power;
    }
}
