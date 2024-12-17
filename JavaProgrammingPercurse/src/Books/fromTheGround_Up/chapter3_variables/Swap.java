package Books.fromTheGround_Up.chapter3_variables;

public class Swap {
    public static void main(String[] args) {
        int a = 7;
        int b = 100;
        int temp;

        System.out.print("Before --");
        System.out.print("a: " + a);
        System.out.println(" ,b: " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.print("After --");
        System.out.print("a: " + a);
        System.out.println(" ,b: "+ b);
    }
}
