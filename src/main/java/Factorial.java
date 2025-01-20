public class Factorial {

    public int getFactorial(int number) {
        if (number >= 0) {
            int result = 1;
            for (int i = 1; i <= number; i++) {
                result = result * i;
            }
            return result;
        } else
            throw new IllegalArgumentException();

    }
}



