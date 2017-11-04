public class Elf extends Character {

    public Elf(String n){
        super(n);
        this.hp = 10;
        this.power = 10;
    }

    public void kick(Character character){
        int opponentHp = character.getHp();
        int opponentPower = character.getPower();
        if (this.power > opponentPower){
            System.out.println("Elf " + this.name + " killed " + character.getClass().getCanonicalName()
                    + " " + character.getName());
            character.decreaseHp(opponentHp);
        }
        else{
            character.decreasePower(1);
            System.out.println("Elf " + this.name + " decresed power of " + character.getClass().getCanonicalName()
                    + " " + character.getName() + " by 1");
        }

        }
}
