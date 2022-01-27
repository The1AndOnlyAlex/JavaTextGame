import java.util.Scanner;

public class player {
    
    static String dialogue = "empty";
    static String name = "Tu";
    static int fame = 0;
    static int cash = 100;
    static int skill = 1;
    static int combat = 1;
    static String label = "none";
    static String recording_gear = "none";
    static int time = 10;
    static String day = "Monday";
    static String location = "home";
    static boolean gym_membership = false;

    static String input = "empty";

    public static void action() {

        Scanner player = new Scanner(System.in);
        
        input = player.nextLine();
        System.out.println("Stats: Enter \"1\" \n Practice: Enter \"2\" \n Move: Enter \"3\" \n Purchase: Enter \"4\" \n Record Label: Enter \"5\"");

        if(input == "1") {
            practice();
        }
        player.close();

    }

    public static void practice() {

        String input = "";
        Scanner player = new Scanner(System.in);
        System.out.println("Practice your rap: Enter \"1\" \n Practice your combat: \"2\"");
        input = player.nextLine();
        
        if ((input == "rap")&&(location == "home")) {
            skill ++;
            time ++;
        }
        else if ((input == "combat")&&(location == "gym")) {
            combat += combat;
            time ++;
        }
        else {System.out.println("Invalid. Please make sure to type in either \"rap\" and be at home or \"combat\" with an activated gym membership.");}

        if (time == 25) {
            time = 1;
        }
        player.close();

    }

    public static void go() {

        String input = "";
        Scanner player = new Scanner(System.in);
        System.out.println("Go home: Enter \"1\" \n Go to the club: \"2\" \n Go to the gym: \"3\"");
        input = player.nextLine();

        if (input == "home") {
            location = "home";
            System.out.println("Arrived at your home");
            time++;
        }
        else if ((input == "club")&&(time >= 21)&&(time <= 24)) {
            location = "club";
            System.out.println("Arrived at the club");
            time++;
        }
        else if ((input == "gym")&&(gym_membership == true)&&(time >= 6)&&(time <= 12)) {
            location = "Arrived at the gym";
            time++;
        }
        else {System.out.println("Invalid. Please type in either \"home\", \"club\", or \"gym\". (The club is only available in the evening from 21 to 24 and the gym is only available if you have an activated gym membership.)");}

        if (time == 25) {
            time = 1;
        }
        player.close();

    }

    public static void stats() {

        System.out.println("Name: " + name);
        System.out.println("Fame: " + fame);
        System.out.println("Cash: " + cash);
        System.out.println("Skill: " + skill);
        System.out.println("Combat: " + combat);
        System.out.println("Record Label: " + label);
        System.out.println("Recording Gear: " + recording_gear);
    }

}
