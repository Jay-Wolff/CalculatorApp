import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);



		char operation;

		String operation1;

		int totalNumbers;

		int radians;

		double numbers;

		double answer;

		String userChoice;

		char startOver='Y';



		while (startOver==('Y') || (startOver==('y'))) {

			System.out.println("Enter the calculator mode: Standard/Scientific");

			userChoice = input.next();


			while (userChoice.equalsIgnoreCase("Standard")) {


				System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");

				operation = input.next().charAt(0);

				switch (operation) {

				case '+':

					System.out.println("How many numbers do you want to add?");

					totalNumbers = input.nextInt();

					System.out.println("Enter " + totalNumbers + " numbers");

					numbers = input.nextDouble();

					for (int i = 1; i< totalNumbers; i++) {

						numbers = numbers + input.nextDouble();

					}

					System.out.println("Result: " + numbers);

					break;

				case '-':

					System.out.println("How many numbers do you want to subtract?");

					totalNumbers = input.nextInt();

					System.out.println("Enter " + totalNumbers + " numbers");

					numbers = input.nextDouble();

					for (int i = 1; i< totalNumbers; i++) {

						numbers = numbers - input.nextDouble();

					}

					System.out.println("Result: " + numbers);

					break;

				case '*':

					System.out.println("How many numbers do you want to multiply?");

					totalNumbers = input.nextInt();

					System.out.println("Enter " + totalNumbers + " numbers");

					numbers = input.nextDouble();

					for (int i = 1; i< totalNumbers; i++) {

						numbers = numbers * input.nextDouble();

					}

					System.out.println("Result: " + numbers);

					break; 

				case '/':

					System.out.println("How many numbers do you want to divide?");

					totalNumbers = input.nextInt();

					System.out.println("Enter " + totalNumbers + " numbers");

					numbers = input.nextDouble();

					for (int i = 1; i< totalNumbers; i++) {

						numbers = numbers / input.nextDouble();

					}

					System.out.println("Result: " + numbers);

					break;

				default : {

					System.out.println("Invalid operation entered");

					continue;

				}

				}

				System.out.println("Do you want to start over? (Y/N)");

				startOver = input.next().charAt(0);

				if (startOver==('Y') || (startOver==('y'))) {

					break;

				} else if (startOver==('N') || (startOver==('n'))) {

					System.out.println("Goodbye");

				}

				break;

			}



			while (userChoice.equalsIgnoreCase("Scientific")) {



				System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x");

				operation1 = input.next();

				switch (operation1) {

				case "+":

					System.out.println("How many numbers do you want to add?");

					totalNumbers = input.nextInt();

					System.out.println("Enter " + totalNumbers + " numbers");

					numbers = input.nextDouble();

					for (int i = 1; i< totalNumbers; i++) {

						numbers = numbers + input.nextDouble();

					}

					System.out.println("Result: " + numbers);

					break;

				case "-":

					System.out.println("How many numbers do you want to subtract?");

					totalNumbers = input.nextInt();

					System.out.println("Enter " + totalNumbers + " numbers");

					numbers = input.nextDouble();

					for (int i = 1; i< totalNumbers; i++) {

						numbers = numbers - input.nextDouble();

					}

					System.out.println("Result: " + numbers);

					break;

				case "*":

					System.out.println("How many numbers do you want to multiply?");

					totalNumbers = input.nextInt();

					System.out.println("Enter " + totalNumbers + " numbers");

					numbers = input.nextDouble();

					for (int i = 1; i< totalNumbers; i++) {

						numbers = numbers * input.nextDouble();

					}

					System.out.println("Result: " + numbers);

					break; 

				case "/":

					System.out.println("How many numbers do you want to divide?");

					totalNumbers = input.nextInt();

					System.out.println("Enter " + totalNumbers + " numbers");

					numbers = input.nextDouble();

					for (int i = 1; i< totalNumbers; i++) {

						numbers = numbers / input.nextDouble();

					}

					System.out.println("Result: " + numbers);

					break;

				case "sin":

					System.out.println("Enter a number in radians to find the sine");

					radians = input.nextInt();

					answer = Math.sin(radians);

					System.out.println("Result: " + answer);

					break;

				case "cos":

					System.out.println("Enter a number in radians to find the cosine");

					radians = input.nextInt();

					answer = Math.cos(radians);

					System.out.println("Result: " + answer);

					break;

				case "tan":

					System.out.println("Enter a number in radians to find the tangent");

					radians = input.nextInt();

					answer = Math.tan(radians);

					System.out.println("Result: " + answer);

					break;

				default : {

					System.out.println("Invalid operation entered");

					continue;

				}

				}

				System.out.println("Do you want to start over? (Y/N)");

				startOver = input.next().charAt(0);

				if ((startOver==('Y')) || (startOver==('y'))) {

					break;

				} else if ((startOver==('N')) || (startOver==('n'))) {

					System.out.println("Goodbye");

				}

				break;

			}

		}



	}

}