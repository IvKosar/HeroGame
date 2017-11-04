import java.util.concurrent.ThreadLocalRandom;

public class King extends Character {

    public King(String n){
        super(n);
        this.hp = ThreadLocalRandom.current().nextInt(5, 15 + 1);
        this.power = ThreadLocalRandom.current().nextInt(5, 15 + 1);
    }

    public void kick(Character character){
        int kickPower = ThreadLocalRandom.current().nextInt(1, this.power + 1);
        System.out.println("King " + this.name + " damaged " + character.getClass().getCanonicalName() + " " +
                character.getName() + " by " + Integer.toString(kickPower) + " hp");
        character.decreaseHp(kickPower);
    }
}
