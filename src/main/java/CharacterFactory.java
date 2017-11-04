import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class CharacterFactory {
    private List<Class<? extends Character>> characters = new ArrayList<>(Arrays.asList(
            Hobbit.class, Elf.class, King.class, Knight.class)
            );
    private static List<String> names = new ArrayList<>(Arrays.asList(
            "Funny man", "Charlie Scene", "J-Dog", "Johny 3 Tears", "Danny")
            );

    public Character createCharacter() throws Exception{
        int index = ThreadLocalRandom.current().nextInt(0, characters.size());
        Class characterClass = characters.get(index);
        index = ThreadLocalRandom.current().nextInt(0, names.size());
        String name = names.get(index);
        Character randomCharacter = (Character)characterClass.asSubclass(characterClass).getConstructor(String.class).newInstance(name);
        return randomCharacter;
    }

}
