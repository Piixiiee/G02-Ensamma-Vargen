import Entities.Player;

public class Model {
    private static Model instance = null;
    public static Player player;

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


}
