import java.util.*;
import java.util.Arrays;
import java.util.stream.*;
import java.lang.*;

public class DRoot2 {

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

        String strNum = Integer.toString(n);
        int[] numsArr = new int[strNum.length()];
        int root = 0; 

        for(int i = 0; i < strNum.length(); i++) {
            //ASCII chars are nums, 0 - 9 are nums starting from decimal 48. To get any num just  '0'
            // numsArr[i] = strNum.charAt(i) - '0';
            numsArr[i] = Integer.valueOf(strNum.charAt(i));
        }
        for(int j = 0; j < numsArr.length; j++) {
            root += numsArr[j];
        }

        if(root < 10) {
            return root;
        }
        +return digital_root(root);
        // Optional<String> String_combine = Arrays.stream(numsArr).reduce((str1, str2) -> str1 + "-" + str2);
    }
}

// NUMS IN HEX
// '0' = 48
// '1' = 49
// '2' = 50
// '3' = 51
// '4' = 52
// '5' = 53
// '6' = 54
// '7' = 55
// '8' = 56
// '9' = 57