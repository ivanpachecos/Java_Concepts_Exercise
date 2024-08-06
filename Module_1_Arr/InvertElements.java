package Module_1_Arr;

import java.util.Arrays;

public class InvertElements {
    public static void main(String[] args) {
        /*
        Invert the elements of an array.
         */
        int[] numbers = {1, 4, 5, 3, 34, 5};
        for (int i = 0; i < numbers.length / 2; i ++) {
            Object temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = (int) temp;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
