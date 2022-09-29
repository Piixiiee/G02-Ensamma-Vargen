import Entities.ACharacter;
import Entities.Player;
import Factories.PlayerFactory;
public class Model {
    private static Model instance = null;

    private Player character;

    public static Model getInstance(){
        if (instance == null) {
            instance = new Model();
            instance.init();
        }
        return instance;
    }
    private void init(){

    }
    public void shutDown(){

    }

    public void createWarriorFromButton() {
        character = PlayerFactory.createWarriorPlayer("SilentWolf");
        System.out.println(character.getName());
    }
    public void createHunterFromButton() {
        character = PlayerFactory.createWarriorPlayer("BraveHunter");
        System.out.println(character.getName());
    }

}
