import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        //System.out.printf("Addition => %d%n", addition(10, 5));
        //System.out.printf("Subtraction => %d%n", subtraction(10, 5));
        //System.out.printf("Multiplication => %d%n", multiplication(10, 5));
        //System.out.printf("Division => %d%n", division(10, 5));
        //System.out.printf("Modulus => %d%n", modulus(7, 3));

        //int userInput = getInteger(1, 20);
        //long factorial = getFactorial(userInput);
        //System.out.printf("Factorial => %d%n", factorial);
        int diceSides = getDiceSide();
        System.out.println(rollDice(diceSides));
    }
    public static int addition(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
    public static int subtraction(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }
    public static int multiplication(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }
    public static int division(int num1, int num2) {
        int result = num1 / num2;
        return result;
    }
    public static int modulus(int num1, int num2) {
        int result = num1 % num2;
        return result;
    }
    public static int getInteger(int min, int max) {
        System.out.print("Enter a number between " + min + " and " + max + ": ");
        Scanner input = new Scanner(System.in);
        int userNum = input.nextInt();
        if (userNum >= min && userNum <= max) {
            return userNum;
        }
        return getInteger(min, max);
    }
    public static long getFactorial(int num){
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result*=i;
        }
        return result;
    }
    public static int getDiceSide() {
        int userChoice = getInteger(4, 20);
        return userChoice;
    }
    public static int randomNumber(int min, int max) {
        int result = (int)Math.floor(Math.random() * (max - min + 1) + min);
        return result;
    }
    public static String rollDice(int sides) {
        System.out.println("Do you want to roll the dice? [y/N]");
        Scanner input = new Scanner(System.in);
        String userChoice = input.nextLine();
        if (userChoice.equalsIgnoreCase("y")) {
            int result1 = randomNumber(1, sides);
            int result2 = randomNumber(1, sides);
            return "The first dice rolled on " + result1 + ". The second dice rolled on " + result2 + ". The total is " + (result1 + result2) + "." ;
        }
        return "Fine. Go away.";
    }
}
