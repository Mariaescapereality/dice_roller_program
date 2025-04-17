import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Java dice roller program

        //declare variables
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numOfDice;
        int total = 0;

        System.out.print("enter the # of dice to roll: ");
        numOfDice = scanner.nextInt();

        //get # of dice from the user
        if (numOfDice > 0) {
            for (int i = 0; i < numOfDice; i++) { //roll all the dice
                int roll = random.nextInt(1, 7);
                printDie(roll);
                System.out.println("You rolled: " + roll);
                total += roll;
            }
            System.out.println("Total: " + total); //get the total
        }
        else {
            System.out.println("# of dice must be greater than 0"); //check if # of dice > 0
        }
        scanner.close();
    }
    //display ascii of dice
    static void printDie(int roll){
        String dice1 = """
                  -------
                 |       |
                 |   •   |
                 |       |
                  -------
                """;
        String dice2 = """
                 -------
                | •     |
                |       |
                |     • |
                 -------
                """;
        String dice3 = """
                 -------
                | •     |
                |   •   |
                |     • |
                 -------
                """;
        String dice4 = """
                 -------
                | •   • |
                |       |
                | •   • |
                 -------
                """;
        String dice5 = """
                 -------
                | •   • |
                |   •   |
                | •   • |
                 -------
                """;
        String dice6 = """
                 -------
                | •   • |
                | •   • |
                | •   • |
                 -------
                """;
        switch (roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid roll");
        }
    }
}