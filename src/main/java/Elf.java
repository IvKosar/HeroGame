public class Elf extends Character {

    public Elf(String n){
        super(n);
        this.hp = 10;
        this.power = 10;
    }

    public void kick(Character character){
        int opponenHp = character.getHp();
        int opponentPower = character.getPower();
        int kickPower = (this.power > opponentPower) ? opponenHp : 1;
        System.out.println("Elf " + this.name + " damaged " + character.getClass().getCanonicalName()
                + " " + character.getName() + " by " + Integer.toString(kickPower) + " hp");
        character.decreaseHp(kickPower);
        }
}
