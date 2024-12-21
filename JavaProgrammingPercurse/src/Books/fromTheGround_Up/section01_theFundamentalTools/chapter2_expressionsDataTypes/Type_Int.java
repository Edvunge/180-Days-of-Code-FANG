package Books.fromTheGround_Up.section01_theFundamentalTools.chapter2_expressionsDataTypes;

public class Type_Int {
    public static void main(String[] args) {
        // + addition
        // - subtraction
        // * multiplication
        // / division
        // % modulus

        int number_1 = 12;
        int number_2 = 10;

        int add = number_1 + number_2;
        int sub = number_2 - number_1;
        int mul = number_1 * number_2;
        int div = number_1 / number_2;
        int mod = number_1 % number_2;

        System.out.println("A Soma " + number_1 + " por " + number_2 + " = " + add);
        System.out.println("A Subtracao " + number_1 + " por " + number_2 + " = " + sub);
        System.out.println("A Multiplicacao " + number_1 + " por " + number_2 + " = " + mul);
        System.out.println("A Divisao " + number_1 + " por " + number_2 + " = " + div);
        System.out.println("A Modulo " + number_1 + " por " + number_2 + " = " + mod);
    }
}
