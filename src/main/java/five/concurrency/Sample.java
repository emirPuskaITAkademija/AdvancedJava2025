package five.concurrency;

import java.util.Arrays;
import java.util.List;

public class Sample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 34, 343, 5, 4, 45, 45, 2323, 544, 5);
        int result = 0;
        for(Integer number : numbers) {
            if(number % 2 == 0){
                result += number;
            }
        }
        System.out.println(result);
    }
}
