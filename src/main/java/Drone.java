public class Elf extends Character {

    public Drone(String n){
        super(n);
        this.hp = 4;
        this.power = 1;
    }

    public void kick(Character character){
        int opponentHp = character.getHp();
        int opponentPower = character.getPower();
        if (this.power > opponentPower){
            System.out.println("Drone " + this.name + " falled at " + character.getClass().getCanonicalName()
                    + " " + character.getName());
            character.decreaseHp(opponentHp);
        }
        else{
            character.decreasePower(3);
            System.out.println("Drone " + this.name + " decresed power of " + character.getClass().getCanonicalName()
                    + " " + character.getName() + " by 3");
        }
        
        }
        
    public void droned(){
        this.hp = 100;
    }
}
