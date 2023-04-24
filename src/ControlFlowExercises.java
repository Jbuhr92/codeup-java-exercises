import java.util.Scanner;
//
//public class ControlFlowExercises {
//    public static void main(String[] args) {
//        // While loop exercise
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }
//        System.out.println();
//
//        // Do-While loop exercises
//        int counter = 0;
//        do {
//            System.out.println(counter);
//            counter += 2;
//        } while (counter <= 100);
//
//        counter = 100;
//        do {
//            System.out.println(counter);
//            counter -= 5;
//        } while (counter >= -10);
//
//        long num = 2;
//        do {
//            System.out.println(num);
//            num *= num;
//        } while (num < 1000000);
//
//        // For loop exercises
//        for (counter = 0; counter <= 100; counter += 2) {
//            System.out.println(counter);
//        }
//
//        for (counter = 100; counter >= -10; counter -= 5) {
//            System.out.println(counter);
//        }
//
//        for (num = 2; num < 1000000; num *= num) {
//            System.out.println(num);
//        }
//
//        // FizzBuzz exercise
//        for (int j = 1; j <= 100; j++) {
//            if (j % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (j % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (j % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(j);
//            }
//        }
//
//        // Display a table of powers
//        Scanner scanner = new Scanner(System.in);
//        String userInput;
//        do {
//            System.out.print("What number would you like to go up to? ");
//            int input = scanner.nextInt();
//            System.out.println("\nHere is your table!\n");
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for (int j = 1; j <= input; j++) {
//                System.out.printf("%-6d | %-7d | %-5d%n", j, j * j, j * j * j);
//            }
//            System.out.print("\nDo you want to continue? (y/n): ");
//            userInput = scanner.next();
//        } while (userInput.equalsIgnoreCase("y"));
//
//        // Convert number grades into letter grades
//        do {
//            System.out.print("Enter a numerical grade from 0 to 100: ");
//            int grade = scanner.nextInt();
//            String letterGrade;
//            if (grade >= 88) {
//                letterGrade = "A";
//            } else if (grade >= 80) {
//                letterGrade = "B";
//            } else if (grade >= 67) {
//                letterGrade = "C";
//            } else if (grade >= 60) {
//                letterGrade = "D";
//            } else {
//                letterGrade = "F";
//            }
//            System.out.println("The corresponding letter grade is: " + letterGrade);
//            System.out.print("Do you want to continue? (y/n): ");
//            userInput = scanner.next();
//        } while (userInput.equalsIgnoreCase("y"));
//
//        scanner.close();
//    }
//}
