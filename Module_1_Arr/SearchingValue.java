package Module_1_Arr;

public class SearchingValue {
    public static void main(String[] args) {
        /*
            Create a program that searches for a specif value in
            an array and return its position
         */
        int[] numbers = {5, 6, 1, 4, 3, 2, 8};
        int value = 8;
        int position = 0;
        String error = "No found";

        for (int i = position; i < numbers.length; i++) {
            if (numbers[i] == value) {
                System.out.println("Value: " + value + " with position: " + i);
            }
            else {
                System.out.println(error);
            }

        }

    }
}
