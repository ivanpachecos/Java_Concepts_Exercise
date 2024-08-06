package Module_1_Arr;

public class SumArr {
    public static void main(String[] args) {
        int[] numbers = {3, 3, 5, 1, 7, 4};
        int totalNumber = 0;

        for (int number : numbers) {
            totalNumber += number;
        }

        System.out.println(totalNumber);
    }
}
