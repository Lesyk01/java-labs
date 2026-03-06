public class Main {
    public static void main(String[] args) {

        System.out.println("--- ЗАВДАННЯ 1 ---");
        int a = 15;
        int b = 4;

        int divisionResult = a / b;
        int remainder = a % b;

        System.out.println("Результат ділення: " + divisionResult);
        System.out.println("Залишок від ділення: " + remainder);


        System.out.println("--- ЗАВДАННЯ 2 ---");
        int number = 72;

        int firstDigit = number / 10;
        int secondDigit = number % 10;
        int sum = firstDigit + secondDigit;

        System.out.println("Сума цифр числа " + number + " дорівнює: " + sum);


        System.out.println("--- ЗАВДАННЯ 3 ---");
        double myNumber = 8.7;

        int roundedNumber = (int) Math.round(myNumber);

        System.out.println("Округлене число: " + roundedNumber);
    }
}