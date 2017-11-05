import java.util.concurrent.ThreadLocalRandom;

public class ArmouredMan extends Character {
    public ArmouredMan(String n){
        super(n);
    }

    public void kick(Character character){
        int kickPower = ThreadLocalRandom.current().nextInt(1, this.power + 1);
        System.out.println(this.getClass().getCanonicalName() + " " +
                this.name + " damaged " + character.getClass().getCanonicalName() + " " +
                character.getName() + " by " + Integer.toString(kickPower) + " hp");
        character.decreaseHp(kickPower);
    }
}
