package Module_1_Arr;

class SumElements {
    public static void main(String[] args) {
        /*
         * Description: Create a program that initializes an 
         * array with 10 integers and calculates the sum of all elements.
         */
        int[] numbers = {23, 1, 2, 3, 4, 5};
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        System.out.println(result);
    }
}
