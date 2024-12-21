package Books.fromTheGround_Up.section01_theFundamentalTools.chapter4_selectionANDdecision;

import java.util.Scanner;
// sinalizado ============================================================================================
public class RockScissorsPaper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int ROCK = 0, SCISSORS = 1, PAPER = 2;

        int player, computer; // human vs computer
        System.out.println("Rock:0; Scissors:1; Paper:2 -- Choose: ");
        player = input.nextInt();
        computer = (int)(3*Math.random()); // a random number 0, 1, or 2
        System.out.println("The computer chooses " + computer);
        System.out.println("****************************************");

        if (player == computer)
            System.out.println("It's a tie!");
        else
            if (player == ROCK)
                if (computer == SCISSORS)
                    System.out.println("Player:rock\nComputer:scissors\nPlayer wins");
                else
                    System.out.println("Player:rock\nComputer:paper\nComputer wins.");
                else
                    if (player == SCISSORS)
                        if (computer == ROCK)
                            System.out.println("Player:scissors\nComputer:rock\nComputer wins.");
                        else
                            System.out.println("Player:scissors\nComputer:rock\nPlayer wins.");
                    else
                        if (computer == ROCK)
                            System.out.println("Player:paper\nComputer:rock\nPlayer wins.");
                        else
                            System.out.println("Player:paper\nComputer:scissors\nComputer wins.");
    }
}
