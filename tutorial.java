//import java.util.Scanner;
import java.util.*;
import java.io.*;

public class tutorial {

    static String dialogue = "empty";
    static String name = "Tu";

    public static String Intro() {

        Scanner player = new Scanner(System.in);
        System.out.println("Hello there aspiring rapper! (Enter to continue)");
        dialogue = player.nextLine();
        System.out.println("I see you're trying to make a name for yourself.");
        dialogue = player.nextLine();
        System.out.println("Well first off, why don't you tell me your rapper name? ");
        System.out.println("Enter name: ");
        name = player.nextLine();
        name = name.replaceAll("\\s", "");
        while(name.isEmpty()) {
            System.out.println("Seriously, what's your name?");
            System.out.println("Enter name: ");
            name = player.nextLine();
            name = name.replaceAll("\\s", "");
        }
        return name;
        
    }

    public static void I() {

        Scanner player = new Scanner(System.in);
        System.out.println(
                    "Let me give you the basic rundown on how you can get started on rapping right away.");
        dialogue = player.nextLine();
        System.out.println(
                    "The first thing you need to know is how to check your stats. Your stats include your ID, Fame, Cash, Skill, and more.");
        dialogue = player.nextLine();
        System.out.println("Stats: Enter \"1\" Practice: Enter \"2\" \n Move: Enter \"3\" \n Purchase: Enter \"4\" \n Record Label: Enter \"5\"");
        System.out.println("Check your current stats right now by typing in \"1\". \n");

    }

    public static void LastDialogue() {

        Scanner player = new Scanner(System.in);
        System.out.println("\n Great!");
        dialogue = player.nextLine();
        System.out.println("\n Well it looks like you need a bit more practice with your rapping skills.");
        dialogue = player.nextLine();
        System.out.println("You can practice whenever you want.");
        dialogue = player.nextLine();
        System.out.println("Just head home by typing 'p.move(home)'.");
        dialogue = player.nextLine();
        System.out.println("Then you can practice your rapping by then typing 'p.practice(rap)'.");
        dialogue = player.nextLine();
        System.out.println("Well, looks like you're good to go! Make sure to keep an eye on time and come meet me at the club at 21 (Military time) by typing in 'p.go(club)'.");
    }
    
}
