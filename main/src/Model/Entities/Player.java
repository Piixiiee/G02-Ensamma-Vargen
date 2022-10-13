package Model.Entities;

//The actual person you play as in the game
public class Player extends ACharacter {
    public Player(double strength, double Health, double armor, String name) {
        super(strength, Health, name, armor);
    }

    public void updateHealth(int newValue) {
        currentHealth= newValue;
        maxHealth = newValue;
    }

    public void setArmor(int newValue) {
        armor = newValue;
    }

    public void setStrength(int newValue) {
        strength = newValue;
    }

    public void setName(String newName) {
        name = newName;
    }
}
