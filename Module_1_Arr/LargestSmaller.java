package Module_1_Arr;

public class LargestSmaller {
    public static void main(String[] args) {
        /*
        Find the largest and smallest number in an array.
         */
        int[] numbers = {5, 3, 2, 5, 6, 7, 4};
        int numberLargest = 0;
        int numberSmallest = numbers[0];

        for (int number : numbers) {
            if (number > numberLargest) numberLargest = number;
            if (numberSmallest > number) numberSmallest = number;
        }

        System.out.println(numberLargest);
        System.out.println(numberSmallest);
    }
}
