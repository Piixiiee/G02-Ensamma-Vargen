package Model.Events.Actions;

import Model.Entities.Player;
import Model.Events.Event;
import Model.Events.EventParser;
import Model.Interfaces.IAction;

public class SelectCharacter implements IAction {
    private final String pathToNextEvent, name;
    private final int strength, health, armor;

    public SelectCharacter(String pathToNextEvent, String name, int strength, int health, int armor) {
        this.pathToNextEvent = pathToNextEvent;
        this.name = name;
        this.strength = strength;
        this.health = health;
        this.armor = armor;
    }
    @Override
    public void performAction(Player player) {
        player.setName(name);
        player.setStrength(strength);
        player.setArmor(armor);
        player.updateHealth(health);
    }

    @Override
    public Event getNextEvent() {
        return EventParser.parse(pathToNextEvent);
    }

    @Override
    public String getActionName() {
        return name;
    }
}
