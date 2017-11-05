import java.util.concurrent.ThreadLocalRandom;

public class King extends ArmouredMan {

    public King(String n){
        super(n);
        this.hp = ThreadLocalRandom.current().nextInt(5, 15 + 1);
        this.power = ThreadLocalRandom.current().nextInt(5, 15 + 1);
    }


}
