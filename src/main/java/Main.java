
/* 
 * Problem
 * x Write a lambda expression that takes an integer and returns the next odd number. 
 *      The expression should be public and static.
 */

public class Main {

    // public static final NumberTransform nextOddNum = new NumberTransform() {
    // public int applyAsInt(int number) {
    // return (number % 2 != 0) ? number + 2 : number + 1;
    // };
    // };

    public static final NumberTransform nextOddNum = number -> (number % 2 != 0) ? number + 2 : number + 1;

    public static void main(String[] args) {
        int num = 5;
        int num2 = 10;

        System.out.println(nextOddNum.applyAsInt(num)); // 7
        System.out.println(nextOddNum.applyAsInt(num2)); // 11
    }
}

interface NumberTransform {
    int applyAsInt(int number);
}
