import java.util.concurrent.ThreadLocalRandom;

public class Knight extends Character {
    public Knight(String n){
        super(n);
        this.hp = ThreadLocalRandom.current().nextInt(2, 21 + 1);
        this.power = ThreadLocalRandom.current().nextInt(2, 12 + 1);
    }

    public void kick(Character character){
        int kickPower = ThreadLocalRandom.current().nextInt(1, this.power + 1);
        System.out.println("Knight " + this.name + " damaged " + character.getClass().getCanonicalName() +
                " " + character.getName() + " by " + Integer.toString(kickPower) + " hp");
        character.decreaseHp(kickPower);
    }
}
