package Books.fromTheGround_Up.chapter3_variables;

public class Stives {
    public static void main(String[] args) {
        int wives = 7;
        int sacks;
        int cats;
        int kits;
        int total;

        sacks = 7 * wives;
        cats =  7 * sacks;
        kits =  7 * cats;
        total = 1 + wives + sacks + cats + kits;

        System.out.println("Wives: "+ wives);
        System.out.println("sacks: "+ sacks);
        System.out.println("Cats: "+ cats);
        System.out.println("Kits: "+ kits);
        System.out.println("Man, wives, sack, cats and kits: " + total);
    }
}
