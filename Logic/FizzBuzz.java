package Logic;

public class FizzBuzz {
    public static void main(String[] args) {
        /*
            Write a Java program that prints the numbers from 1 to 100. But for
            multiples of three,it prints "Fizz" instead of the number, and for
            multiples of five, it prints "Buzz". For numbers that are multiples
            of both three and five, it prints "FizzBuzz".
         */
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
