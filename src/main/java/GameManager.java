import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class GameManager {
    public static void main(String[] args) throws Exception{
        CharacterFactory characterFactory = new CharacterFactory();
        Character character1, character2;
        character1 = characterFactory.createCharacter();
        do{
            character2 = characterFactory.createCharacter();
        }while(character2.getName() == character1.getName());

        BattlePresenter battlePresenter = new BattlePresenter();
        battlePresenter.introduceBattle(character1, character2);

        fight(character1, character2);
    }

    public static void fight(Character c1, Character c2) throws Exception{
        List<Character> opponents = new ArrayList<>(Arrays.asList(c1, c2));
        int index = ThreadLocalRandom.current().nextInt(0, opponents.size());
        Character firstOpponent = opponents.get(index);
        Character secondOpponent = opponents.get((index + 1) % 2);
        if (firstOpponent instanceof Hobbit && secondOpponent instanceof Hobbit){
            System.out.println("Hobbits are crying");
            Thread.sleep(1500);
            System.out.println("Still crying");
            Thread.sleep(1500);
            System.out.println("Finally, hobbits runed out of tears");
            return;
        }
        else if (c1 instanceof Elf && c2 instanceof Elf){
            System.out.println("Elfs are fighting forever");
            Thread.sleep(1000);
            return;
        }
        while (firstOpponent.isAlive && secondOpponent.isAlive){
            firstOpponent.kick(secondOpponent);
            System.out.println();
            Thread.sleep(3000);
            if (secondOpponent.isAlive) {
                secondOpponent.kick(firstOpponent);
            }
            System.out.println();
            Thread.sleep(3000);
        }

        if (firstOpponent.isAlive){
            System.out.println(firstOpponent.getClass().getCanonicalName() + " " + firstOpponent.getName() + " WON!");
        }
        else{
            System.out.println(secondOpponent.getClass().getCanonicalName() + " " + secondOpponent.getName() + " WON!");
        }
    }
}
