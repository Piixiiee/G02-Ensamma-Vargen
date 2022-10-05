package Model.Forrest;

import Model.Entities.Player;

import java.util.List;

//An event that occurs when the player has to make a choice to move to the next event
public class Choice extends Event{

    private String pathToNextEvent;
    private String flavourText;

    public Choice(String pathToNextEvent, String flavourText){

        this.pathToNextEvent = pathToNextEvent;
        this.flavourText = flavourText;

    }

    //public Event getNextEvent(){return Event.getEvent(pathToNextEvent);}
    public String getActionName(){return flavourText;}
}
