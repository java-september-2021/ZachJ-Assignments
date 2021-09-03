public class Fizzbuzz {
    public String Fizzbuzz(Integer z) {
        if ((z % 15) == 0) {
            return ("FizzBuzz!");
        } else if ((z % 5) == 0) {
            return ("Buzz!");
        } else if ((z % 3) == 0) {
            return ("Fizz!");
        }
        return Integer.toString(z);
    }
}