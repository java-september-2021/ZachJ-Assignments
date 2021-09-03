public class FizzbuzzTest {
    // This will be the launch point for the application
    // For now, we are using this method to test our
    // FizzBuzz methods
    public static void main(String[] args) {
        Fizzbuzz tester = new Fizzbuzz();

        System.out.println(tester.Fizzbuzz(9)); // Fizz
        System.out.println(tester.Fizzbuzz(10)); // Buzz
        System.out.println(tester.Fizzbuzz(15)); // FizzBuzz
        System.out.println(tester.Fizzbuzz(16)); // 16
        System.out.println(tester.Fizzbuzz(2)); // 2

        // Uncomment the following for a more comprehensive test:
        /*
         * for (int i = 1; i <= 50; i++) { System.out.println(tester.fizzBuzz(i)); }
         */
    }
}
