//import java.util.Scanner;

public class main {

    static String input = "empty";
    static boolean gameEnd = false;

    public static void main(String[] args) {

        //Scanner sss = new Scanner(System.in);

        String introValue = tutorial.Intro1();
        System.out.println("Well " + introValue + ", it's nice to meet you.");
        player.name = introValue;
        tutorial.Intro2();
        player.stats();
        tutorial.Intro3();
        
        while(gameEnd != false) {
            player.action();
        }

        if(1 == 1) {
            //Win Game
        }
        else {
            //Lose Game
        }


        /*
        1/25/2022: Get rid of the majority of the static keywords in tutorial and player


        Make sure to put this entire tutorial into a seperate class/function and just run it here in main. In addition, make sure to actually TAKE IN the user input so that they can type in what action they want to carry out.
        To do list:
        -Add weekly competition on Friday nights
        -Make a way to be signed into a record label through fame and money
        -Random encounters with street thugs who can steal your money.
        -Win this game demo by reaching a certain fame level and then challenging and beating the champion rapper.
        */




    }


}
