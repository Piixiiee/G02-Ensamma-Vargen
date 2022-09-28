import Factories.PlayerFactory;
import com.sun.javafx.collections.MappingChange;

import java.util.Objects;
import java.util.Scanner;

public class Controller {

    private static final Scanner scanner = new Scanner(System.in);



    public static void startTerminalGame(){
        String ans;
        System.out.println("Welcome to the Lone Wolf! (terminal version)");
        while(true){
            System.out.println("Would you like to start a new game? y/n");
            ans = scanner.next();
            if(Objects.equals(ans, "y")) {
                terminalGameChooseClass();
                break;
            } else if (Objects.equals(ans, "n")){
                System.out.println("The game will now close");
                Model.getInstance().shutDown();
                break;
            } else {
                System.out.println("Enter y or n:");
            }
        }
        firstEncounter();

    }
    private static void terminalGameChooseClass(){
        int choice;
        String name;
        while(true){
            System.out.println("Choose class: \n 1: Warrior \n 2: Hunter");
            choice = scanner.nextInt();
            if(choice==1){
                System.out.println("Enter your character's name: ");
                name = scanner.next();
                Model.player = PlayerFactory.createWarriorPlayer(name);
                break;
            } else if(choice == 2){
                System.out.println("Enter your character's name: ");
                name = scanner.next();
                Model.player = PlayerFactory.createHunterPlayer(name);
                break;
            } else {
                System.out.println("Enter 1 or 2");
            }
        }
    }
    private static void firstEncounter(){
        System.out.println("You wake up cold, wet and alone");
        System.out.println("Surrounded by dark forest, you cannot remember where you came from or why you are there");

    }
}
