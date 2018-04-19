public class Warrior extends AbstractCharacter {


    public static final Integer POWER = 4;

    private Dice dice;

    public Warrior(String name){
       super(name);
    }

    @Override
    public void fight(Character character) {
        System.out.println(character.getName()+"=>"+character.getPower());
        System.out.println(this.getName()+"=>"+this.getPower());
        if(this.getPower()> character.getPower()){
            System.out.println(this.name+" ha ganado");
            character.setDamage(this.getPower()-character.getPower());
            System.out.println(character.getName()+" ha recibido "+character.getDamage()+" de daño");
        }

        if(character.getPower() > this.getPower()){
            System.out.println(this.name+" ha perdido");
            this.setDamage(character.getPower()-this.getPower());
            System.out.println(this.name+" ha recibido "+this.getDamage()+" de daño");
        }

        if(character.getPower() == this.getPower()){
            System.out.println("hay empate");
        }


    }

    @Override
    public Integer getPower() {
       Integer powerAux = this.POWER - getDamage();
       if( powerAux < 0)
           return 0;
       return powerAux;
    }


    @Override
    public boolean isAlive() {
        if(this.getPower()<=this.getDamage()){

            return false;
        }else

        return super.isAlive();
    }
}
