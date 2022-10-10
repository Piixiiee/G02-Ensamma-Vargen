package View;

import Model.Entities.Player;
import Model.Interfaces.IAction;
import Model.Model;
import Model.Events.*;
import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

//Dumb class for making the project run in the terminal :)
public class CLI {
    public static void main (String[] args ) throws IOException
    {
        System.out.println("Welcome to the Lone Wolf!\nPress any key to begin your adventure");

        //Console cons = System.console();
        Scanner scanner = new Scanner(System.in);

        Event startEvent = EventParser.parse("assets/AllEvents/startEvent.xml");

        Model model = new Model(new Player(2, 8, 1, "Vargis"), startEvent);

        scanner.nextLine();

        String keyPressed;
        while (true)
        {
            Event currentEvent = model.getCurrentEvent();
            System.out.println(currentEvent.getEventText());
            List<IAction> choices = currentEvent.getActions();
            for (int i = 0; i < choices.size(); i++)
            {
                System.out.println(i + choices.get(i).getActionName());
            }
            keyPressed = scanner.nextLine();
            System.out.println(keyPressed);

        }

    }



}