import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class BattlePresenter{
    public void introduceBattle(Character c1, Character c2) throws Exception{
        List<String> adjectives = new ArrayList<>(Arrays.asList(
                "super duper", "bombastic", "powerful", "glorious", "Love of crowd", "megacool", "first boy at the village"
        ));

        System.out.println("Today gonna be a great battle!");
        Thread.sleep(1000);
        System.out.println("Crowd is getting crazy!");
        Thread.sleep(1000);

        System.out.println("Welcome the first opponent!");
        Thread.sleep(1000);
        presentCharacter(c1, adjectives);

        System.out.println("And welcome the second one!");
        Thread.sleep(1000);
        presentCharacter(c2, adjectives);

        System.out.println("Let the battle begin!!!");
        System.out.println();
        Thread.sleep(1000);
    }

    private void presentCharacter(Character c, List<String> adjectives) throws Exception{
        int firstAjectiveIndex, secondAdjectiveIndex;
        firstAjectiveIndex = ThreadLocalRandom.current().nextInt(0, adjectives.size());
        do {
            secondAdjectiveIndex = ThreadLocalRandom.current().nextInt(0, adjectives.size());
        }while(secondAdjectiveIndex == firstAjectiveIndex);
        System.out.println(adjectives.get(firstAjectiveIndex));
        Thread.sleep(1000);
        System.out.println(adjectives.get(secondAdjectiveIndex));
        Thread.sleep(1000);
        System.out.println(c.getClass().getCanonicalName() + " " + c.getName() + "!");
        Thread.sleep(1000);
    }
}
