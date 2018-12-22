import java.util.*;
import java.util.stream.*;

public class GetSum {

    // Given two integers a and b, which can be positive or
    // negative,find the sum of all the numbers between including
    // them too and return it. If the two numbers are equal return //a or b.

    // sumInBetween(1, 0) == 1 // 1 + 0 = 1
    // sumInBetween(1, 2) == 3 // 1 + 2 = 3
    // sumInBetween(0, 1) == 1 // 0 + 1 = 1
    // sumInBetween(1, 1) == 1 // 1 Since both are same
    // sumInBetween(-1, 0) == -1 // -1 + 0 = -1
    // sumInBetween(-1, 2) == 2 // -1 + 0 + 1 + 2 = 2

    public static void main(String[] args) {

        System.out.println(sumInBetween(-4, 4));

    }

    public static int sumInBetween(int start, int end) {

        List<Integer> range = new ArrayList<Integer>();

        if(start == end) {
            return start;
        }
        if(start > end) {
            return start + end;
        }

        for(int i = start; i <= end; i++) {
            range.add(i);
        }
        
        //similar to reduce in javascript except accumulator(ans) value comes before callback function(lambda expression )
        int sum = range.stream().reduce(0, (ans, i) -> ans + i);

        return sum;
    }
}