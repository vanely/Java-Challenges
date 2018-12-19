public class DRoot {

    // A digital root is the recursive sum of all the digits in a
    // number.Given n, take the sum of the digits of n.If that
    // value has two digits, continue reducing in this way until
    // a single - digit number is produced.This is only
    // applicable to the natural numbers.

    private static int num1 = 16;
    // digital_root(16)
    // => 1 + 6
    // => 7

    private static int num2 = 942;
    // digital_root(942)
    // => 9 + 4 + 2
    // => 15 ...
    // => 1 + 5
    // => 6

    private static int num3 = 132189;
    // digital_root(132189)
    // => 1 + 3 + 2 + 1 + 8 + 9
    // => 24 ...
    // => 2 + 4
    // => 6

    private static int num4 = 93193;

    // digital_root(493193)
    // => 4 + 9 + 3 + 1 + 9 + 3
    // => 29 ...
    // => 2 + 9
    // => 11 ...
    // => 1 + 1
    // => 2

    public static void main(String[] args) {

        System.out.println(digital_root(num3));
    }

    public static int digital_root(int n) {

        return root(n);
    }

    public static int root(int inputnumber) {
        if (inputnumber < 10) {
            return inputnumber;
        } else {
            return root(sumofdigit(inputnumber));
        }
    }

    // calculate sum of digits
    public static int sumofdigit(int inputnumber) {
        if (inputnumber < 10)
            return inputnumber;
        return sumofdigit(inputnumber / 10) + inputnumber % 10;
    }
}