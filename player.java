import java.util.Scanner;

public class player {
    
    static public String dialogue = "empty";
    static public String name = "Tu";
    static public  int fame = 0;
    static public int cash = 100;
    static public int skill = 1;
    static public int combat = 1;
    static public String label = "none";
    static public String recording_gear = "none";
    static public int time = 10;
    static public String day = "Monday";
    static public String location = "home";
    static public boolean gym_membership = false;

    static String input = "empty";



    public static void action() {

        Scanner player = new Scanner(System.in);
        
        input = player.nextLine();
        System.out.println("Stats: Enter \"1\" \n Practice: Enter \"2\" \n Move: Enter \"3\" \n Purchase: Enter \"4\" \n Record Label: Enter \"5\"");

        if(Integer.parseInt(input) == 1) {
            stats();
        }
        else if(Integer.parseInt(input) == 2) {
            practice();
        }
        else if(Integer.parseInt(input) == 3) {
            move();
        }
        else if(Integer.parseInt(input) == 4) {
            buy();
        }
        else if(Integer.parseInt(input) == 5) {
            rlSign();
        }
        else {System.out.println("Invalid. Please make sure to type in either \"1\", \"2\", \"3\", \"4\", or \"5\".");}

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

    public static void practice() {

        String input = "";
        Scanner player = new Scanner(System.in);
        System.out.println("Practice your rap: Enter \"1\" \n Practice your combat: \"2\"");
        input = player.nextLine();

        int skillGain = 1;
        if(recording_gear == "Good Mic") {
            skillGain = 2;
        }
        else if(recording_gear == "Great Mic") {
            skillGain = 3;
        }
        else if(recording_gear == "Amazing Mic") {
            skillGain = 5;
        }
        else {}
        
        if ((Integer.parseInt(input) == 1)&&(location == "home")) {
            System.out.println("You practiced your rap for an hour and gained" + skillGain + "skill!");
            skill = skill + skillGain;
            time ++;
        }
        else if ((Integer.parseInt(input) == 2)&&(location == "gym")) {
            combat ++;
            time ++;
        }
        else {System.out.println("Invalid. Please make sure to type in either \"1\" at home or \"2\" with an activated gym membership.");}

        if (time == 25) {
            time = 1;
        }
        player.close();

    }

    public static void move() {

        String input = "";
        Scanner player = new Scanner(System.in);
        System.out.println("Go home: Enter \"1\" \n Go to the club: \"2\" \n Go to the gym: \"3\"");
        input = player.nextLine();

        if (Integer.parseInt(input) == 1) {
            location = "home";
            System.out.println("Arrived at your home");
            time++;
        }
        else if ((Integer.parseInt(input) == 2)&&(time >= 21)&&(time <= 24)) {
            location = "club";
            System.out.println("Arrived at the club");
            time++;
            events.clubPerform();
        }
        else if ((Integer.parseInt(input) == 3)&&(gym_membership == true)&&(time >= 6)&&(time <= 12)) {
            location = "Arrived at the gym";
            time++;
        }
        else {System.out.println("Invalid. Please type in either \"1\", \"2\", or \"3\". (The club is only available in the evening from 21 to 24 and the gym is only available if you have an activated gym membership.)");}

        if (time == 25) {
            time = 1;
        }
        player.close();

    }

    public static void buy() {

        String input = "";
        Scanner player = new Scanner(System.in);
        System.out.println("Good mic (2 skill when practicing rap): \"1\" for $100 \n Great mic (3 skill when practicing rap): \"2\" for $250 \n Amazing mic (5 skill when practicing rap): \"3\" for $1000 \n 1 week Gym membership (Access to the gym for a week): \"4\" for $50");
        input = player.nextLine();

        if (Integer.parseInt(input) == 1) {
            recording_gear = "Good Mic";
            System.out.println("You bought a Good Mic!");
        }
        else if ((Integer.parseInt(input) == 2)&&(time >= 21)) {
            recording_gear = "Great Mic";
            System.out.println("You bought a Great Mic!");
        }
        else if ((Integer.parseInt(input) == 3)&&(gym_membership == true)&&(time >= 6)) {
            recording_gear = "Amazing Mic";
            System.out.println("You bought an Amazing Mic!");
        }
        else if ((Integer.parseInt(input) == 4)&&(gym_membership == true)&&(time >= 6)) {
            gym_membership = true;
            System.out.println("You bought a one week gym membership!");
        }
        else {System.out.println("Invalid. Please type in either \"1\", \"2\", \"3\" or \"4\". (Make sure you have enough money to purchase the item.)");}

        player.close();

    }

    public static void rlSign() {

        String input = "";
        Scanner player = new Scanner(System.in);
        System.out.println("Jet Records (good income and fame boost): \"1\" for $100 and at least 10 fame \n Interscope Records (great income and fame boost): \"2\" for $250 and at least 50 fame \n Lenny Industry Records and co. (Amazing income and fame boost): \"3\" for $1000 and at least 100 fame");
        input = player.nextLine();

        if (Integer.parseInt(input) == 1) {
            label = "Jet Records";
            System.out.println("Congratulations! You are now signed under Jet Records");
        }
        else if ((Integer.parseInt(input) == 2)&&(time >= 21)) {
            label = "Interscope Records";
            System.out.println("Congratulations! You are now signed under Interscope Records");
        }
        else if ((Integer.parseInt(input) == 3)&&(gym_membership == true)&&(time >= 6)) {
            label = "Lenny Industry Records and co.";
            System.out.println("Congratulations! You are now signed under Lenny Industry Records and co.");
        }
        else {System.out.println("Invalid. Please type in either \"1\", \"2\", or \"3\". (Make sure you have enough money and fame to be signed.)");}

        player.close();

    }
}
