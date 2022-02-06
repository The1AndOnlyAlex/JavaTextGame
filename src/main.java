//import java.util.Scanner;

public class main {

    static String input = "empty";
    static boolean gameGoing = true;

    public static void main(String[] args) {

        //Scanner sss = new Scanner(System.in);

        String introValue = tutorial.Intro1();
        System.out.println("Well " + introValue + ", it's nice to meet you.");
        player.name = introValue;
        tutorial.Intro2();
        player.stats();
        tutorial.Intro3();
        
        while(gameGoing = true) {
            player.action();
        }

        if(1 == 1) {
            //Win Game
        }
        else {
            //Lose Game
        }


        /*
        To do list:

        1/25/2022: Get rid of the majority of the static keywords in tutorial and player
        -Add weekly competition on Friday nights
        -Random encounters with street thugs who can steal your money.
        -Win this game demo by reaching a certain fame level and then challenging and beating the champion rapper.


        2/2/2022:
        -Add SIXTH option to check the time.
        -Tell user the current time if the place they want to go is closed
        -Make an easier way to make money (DONATIONS + WORK)
        */




    }


}
