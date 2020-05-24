import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Tell the user choice a mode:
        System.out.println("Please choice a calculation mode:");
        System.out.println("0: arithmetic operations.");
        System.out.println("1: base conversions.");

        // check the input:
        int mode = input.nextInt();
        if (mode == 0) {
            // the user has chosen the first mode:
            System.out.println("Please choice an operation from the list:");
            System.out.println("0: for addition.");
            System.out.println("1: for subtraction.");
            System.out.println("2: for multiplication.");
            System.out.println("3: for division.");
            // * add more operations here.

            // read the operation
            int operation = input.nextInt();

            // ask for inputs:
            System.out.print("Please enter the fist number: ");
            int num1 = input.nextInt();

            System.out.print("Now enter the second one: ");
            int num2 = input.nextInt();

            switch (operation) {
                case 0:
                    // the user has chosen addition:
                    System.out.printf("%s + %s = %s\n", num1, num2, num1 + num2);
                    break;
                case 1:
                    // the user has chosen subtraction:
                    System.out.printf("%s - %s = %s\n", num1, num2, num1 - num2);
                    // * subtract the 2 numbers and print the result.
                    break;
                case 2:
                    // the user has chosen multiplication:
                    System.out.printf("%s × %s = %s\n", num1, num2, num1 * num2);
                    // * multiply the 2 numbers and print the result.
                    break;
                case 3:
                    // the user has chosen division:
                    System.out.printf("%s ÷ %s = %s\n", num1, num2, num1 / num2);
                    // * divide the 2 number and print the result.
                    break;

                default:
                    // the user has and invalid operation:
                    System.out.println("Invalid operation, please try again");
                    // * print an error message.
                    break;
            }

        } else if (mode == 1) {
            // Inspired from Haider Jalal's calculator ❤️.
            // the user is in the second mode:
            System.out.println("Please choice a conversions mode:");
            System.out.println("0: DEC to BIN");
            System.out.println("1: DEC to HEX");
            System.out.println("2: DEC to OCT");

            // read the conversion type:
            int conversion = input.nextInt();

            // ask for inputs:
            System.out.print("Please enter the number: ");
            int num = input.nextInt();

            // a string to hold the result:
            String result = "";

            switch (conversion) {
                case 0:
                    // DEC to BIN:
                    while (num > 0) {
                        result = num % 2 + result;
                        num /= 2;
                    }
                    break;
                case 1:
                    // DEC to HEX:
                    while (num > 0) {
                        int division = num % 16;
                        switch (division) {
                            case 10:
                                result = "A" + result;
                                break;
                            case 11:
                                result = "B" + result;
                                break;
                            case 12:
                                result = "C" + result;
                                break;
                            case 13:
                                result = "D" + result;
                                break;
                            case 14:
                                result = "E" + result;
                                break;
                            case 15:
                                result = "F" + result;
                                break;
                            default:
                                result = division + result;
                        }
                        num /= 16;
                    }
                    // * convert the DEC number to HEX and store it in the result variable.
                    break;
                case 2:
                    // DEC to OCT:
                    while (num > 0) {
                        result = num % 8 + result;
                        num /= 8;
                    }
                    // * convert the DEC number to OCT and store it in the result variable.
                    break;

                default:
                    // the user has and invalid operation:
                    System.out.println("Invalid operation, please try again");
                    // * print an error message.
                    break;
            }

            System.out.println(result);
        } else {
            // invalid mode:
            System.out.println("You entered an invalid mode, please try again with a valid one.");
        }

        input.close();
    }
}
