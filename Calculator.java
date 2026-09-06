public class Calculator {

    public long calculateFactorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException(
                "Input must be a non-negative integer."
            );
        }

        if (number == 0 || number == 1) {
            return 1;
        }

        long factorial = 1;

        for (int i = 2; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public long sumUpTo(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n must be at least 1.");
        }

        long sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }

        String normalized = s.replace(" ", "").toLowerCase();

        for (int i = 0; i < normalized.length() / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println(
            "Factorial of 5: " + calculator.calculateFactorial(5)
        );

        System.out.println(
            "Factorial of 0: " + calculator.calculateFactorial(0)
        );

        System.out.println(
            "Factorial of 1: " + calculator.calculateFactorial(1)
        );

        try {
            System.out.println(
                "Factorial of -2: " + calculator.calculateFactorial(-2)
            );
        } catch (IllegalArgumentException exception) {
            System.out.println(
                "Factorial of -2 failed: " + exception.getMessage()
            );
        }

        System.out.println(
            "Sum up to 5: " + calculator.sumUpTo(5)
        );

        System.out.println(
            "Sum up to 10: " + calculator.sumUpTo(10)
        );

        try {
            System.out.println(
                "Sum up to 0: " + calculator.sumUpTo(0)
            );
        } catch (IllegalArgumentException exception) {
            System.out.println(
                "Sum up to 0 failed: " + exception.getMessage()
            );
        }
        System.out.println("madam: " + calculator.isPalindrome("madam"));
System.out.println("Race Car: " + calculator.isPalindrome("Race Car"));
System.out.println("hello: " + calculator.isPalindrome("hello"));
System.out.println("null: " + calculator.isPalindrome(null));
System.out.println("empty: " + calculator.isPalindrome(""));
System.out.println("Madam: " + calculator.isPalindrome("Madam"));
System.out.println("hello world: " + calculator.isPalindrome("hello world"));

System.out.println("5 is odd: " + calculator.isOdd(5));
System.out.println("6 is odd: " + calculator.isOdd(6));
    }
}