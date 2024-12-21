package Books.fromTheGround_Up.section01_theFundamentalTools.chapter2_expressionsDataTypes;

public class Type_Boolean {
    public static void main(String[] args) {
        System.out.print("If X is closed and Y is closed, Flow: ");
        System.out.println((true && !true || !true && !true || !true && true) && (true || !true));
    }
}
