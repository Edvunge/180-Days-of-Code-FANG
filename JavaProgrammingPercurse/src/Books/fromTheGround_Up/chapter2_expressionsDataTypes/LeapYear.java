package Books.fromTheGround_Up.chapter2_expressionsDataTypes;

public class LeapYear {
    public static void main(String[] args) {
        System.out.print("The year 1800 is a leap year? True or false: ");
        System.out.println(1800%4 ==0 && 1800 % 100 !=0 || 1800%400 == 0);
    }
}
