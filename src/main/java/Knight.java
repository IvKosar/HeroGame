import java.util.concurrent.ThreadLocalRandom;

public class Knight extends ArmouredMan {
    public Knight(String n){
        super(n);
        this.hp = ThreadLocalRandom.current().nextInt(2, 21 + 1);
        this.power = ThreadLocalRandom.current().nextInt(2, 12 + 1);
    }
}
