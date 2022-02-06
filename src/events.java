import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class events {

    public static int clubPerform(int fame, int skill) {
        Random crowdRandomizer = new Random();
        int crowdSize = crowdRandomizer.nextInt(fame);
        String input = "";
        Scanner player = new Scanner(System.in);

        System.out.println("You step on stage and get ready to perform.");
        input = player.nextLine();
        System.out.println("There are " + crowdSize + " in the crowd listening in.");
        input = player.nextLine();
        System.out.println("You begin your rap.");
        input = player.nextLine();

        Random performanceRandomizer = new Random();
        int crowdApproval = performanceRandomizer.nextInt(skill);
        System.out.println("Crowd approval: " + crowdApproval);
        input = player.nextLine();
        
        Random fanRandomizer = new Random();
        int fansGained = Math.round(crowdApproval / fanRandomizer.nextInt(5));
        
        return fansGained;
    }

    //ADD EVENTS FOR THE GAME
}
