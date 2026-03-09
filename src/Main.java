public class Main {
    public static void main(String[] args) {

        System.out.println("--- task 1 ---");
        int a = 15;
        int b = 4;

        int divisionResult = a / b;
        int remainder = a % b;

        System.out.println("Division result: " + divisionResult);
        System.out.println("Remainder of division:" + remainder);


        System.out.println("--- Taks 2 ---");
        int number = 72;

        int firstDigit = number / 10;
        int secondDigit = number % 10;
        int sum = firstDigit + secondDigit;

        System.out.println("Sum of the digits of a number" + number + " = " + sum);


        System.out.println("--- Task 3  ---");
        double myNumber = 8.7;

        int roundedNumber = (int) Math.round(myNumber);

        System.out.println("Rounded number: " + roundedNumber);
    }
}
