package Books.fromTheGround_Up.section01_theFundamentalTools.chapter4_selectionANDdecision;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double DOLLARS_PER_EURO = 1.31;
        int transactionType;
        double euros, dollars;

        System.out.println("Enter 1 to convert from dollars to euros and 2 from euros to dollars:");
        transactionType = input.nextInt();

        if (transactionType == 1) {
            System.out.println("Number of dollars:");
            dollars = input.nextDouble();
            euros = dollars / DOLLARS_PER_EURO;
            System.out.println("Number of euros: " + euros);
        } else {
            System.out.println("Numbers of euros: ");
            euros = input.nextDouble();
            dollars = euros*DOLLARS_PER_EURO;
            System.out.println("Numbers of dollars: " + dollars);
        }
    }
}
