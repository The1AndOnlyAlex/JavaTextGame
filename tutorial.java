//import java.util.Scanner;
import java.util.*;

public class tutorial {

    static String input = "empty";

    static Scanner player = new Scanner(System.in);

    public static void CloseScanner()
    {
        player.close();
    }

    public static String Intro() {

       
        System.out.println("Hello there aspiring rapper! (Enter to continue)");
        input = player.nextLine();

        System.out.println("I see you're trying to make a name for yourself.");
        input = player.nextLine();
        System.out.println("Well first off, why don't you tell me your rapper name? ");
        System.out.println("Enter name: ");
        input = player.nextLine();
        input = input.replaceAll("\\s", "");
        while(input.isEmpty()) {
            System.out.println("Seriously, what's your name?");
            System.out.println("Enter name: ");
            input = player.nextLine();
            input = input.replaceAll("\\s", "");
        }
        //player.close();
        return input;

    }

    public static String I() {

        //Scanner player = new Scanner(System.in);
        System.out.println(
                    "Let me give you the basic rundown on how you can get started on rapping right away.");
        input = player.nextLine();
        System.out.println(
                    "The first thing you need to know is how to check your stats. Your stats include your ID, Fame, Cash, Skill, and more.");
        input = player.nextLine();
        System.out.println("Stats: Enter \"1\" \n Practice: Enter \"2\" \n Move: Enter \"3\" \n Purchase: Enter \"4\" \n Record Label: Enter \"5\"");
        System.out.println("Check your current stats right now by typing in \"1\". \n");

        while(input != "1") {
            System.out.println("Please type in 1 for now.");
            input = player.nextLine();
        }
        //player.close();
        return input;

    }

    public static void LastDialogue() {

        //Scanner player = new Scanner(System.in);
        System.out.println("\n Great!");
        input = player.nextLine();
        System.out.println("\n Well it looks like you need a bit more practice with your rapping skills.");
        input = player.nextLine();
        System.out.println("You can practice whenever you want.");
        input = player.nextLine();
        System.out.println("Just head home by typing 'p.move(home)'.");
        input = player.nextLine();
        System.out.println("Then you can practice your rapping by then typing 'p.practice(rap)'.");
        input = player.nextLine();
        System.out.println("Well, looks like you're good to go! Make sure to keep an eye on time and come meet me at the club at 21 (Military time) by typing in 'p.go(club)'.");
        //player.close();

    }
    
}
