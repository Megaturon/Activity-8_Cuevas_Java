package Act8Package;

import java.util.Scanner;

public class geometry {
	final static double pi = 3.14;
	
	public static double rectPerimeter(double l, double w) {
		double perimeter = 2 * (l + w);
		return perimeter;
	}
	
	public static double rectArea(double l, double w) {
		double area = l * w;
		return area;
	}
	
	public static double cylinderVolume(double r, double h) {
		double volume = pi * Math.pow(r,  2) * h;
		return volume;
	}
	
	public static double circleCircumference(double r) {
		double circumference = 2 * pi * r;
		return circumference;
	}
	
	public static double lengthHypotenuse (double a, double b) {
		double hypotenuse = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		return hypotenuse;
	}
	
	public static void main(String[] args) {
		Scanner responder = new Scanner(System.in);
		int decider = 0;
		double number1 = 0;
		double number2 = 0;
		boolean isDone = false;
		boolean isShowExitScreen = false;
		boolean error = false;
		String decide = null;
		while(!isDone) {
			System.out.println("Geometric Calculations");
			System.out.println("1. Perimeter of a rectangle");
			System.out.println("2. Area of a rectangle");
			System.out.println("3. Volume of a cylinder");
			System.out.println("4. Circumference of a circle");
			System.out.println("5. Length of the Hypotenuse");
			System.out.println("6, Exit");
			number1 = 0;
			number2 = 0;
			do {
				System.out.println("Please enter a number between 1-6!");
			    while (!responder.hasNextInt()) {
			        System.out.println("That's not a number!");
			        responder.next();
			    }
			    decider = responder.nextInt();
			} while (decider <= 0 || decider >= 7);
			switch(decider) {
				case 1:
					System.out.println("Please enter the length of the rectangle:");
					while (!responder.hasNextDouble()) {
				        System.out.println("That's not a number!");
				        responder.next();
				    }
				    number1 = responder.nextDouble();
				    System.out.println("Please enter the width of the rectangle:");
					while (!responder.hasNextDouble()) {
				        System.out.println("That's not a number!");
				        responder.next();
				    }
				    number2 = responder.nextDouble();
				    System.out.println("The Rectangle's Perimeter is: " + rectPerimeter(number1,number2));
					isShowExitScreen = true;
					break;
				case 2:
					System.out.println("Please enter the length of the rectangle:");
					while (!responder.hasNextDouble()) {
				        System.out.println("That's not a number!");
				        responder.next();
				    }
				    number1 = responder.nextDouble();
				    System.out.println("Please enter the width of the rectangle:");
					while (!responder.hasNextDouble()) {
				        System.out.println("That's not a number!");
				        responder.next();
				    }
				    number2 = responder.nextDouble();
				    System.out.println("The Rectangle's Area is: " + rectArea(number1,number2));
					isShowExitScreen = true;
					break;
				case 3:
					System.out.println("Please enter the radius of the cylinder:");
					while (!responder.hasNextDouble()) {
				        System.out.println("That's not a number!");
				        responder.next();
				    }
				    number1 = responder.nextDouble();
				    System.out.println("Please enter the height of the cylinder:");
					while (!responder.hasNextDouble()) {
				        System.out.println("That's not a number!");
				        responder.next();
				    }
				    number2 = responder.nextDouble();
				    System.out.println("The Cylinder's Volume is: " + cylinderVolume(number1,number2));
					isShowExitScreen = true;
					break;
				case 4:
					System.out.println("Please enter the radius of the circle:");
					while (!responder.hasNextDouble()) {
				        System.out.println("That's not a number!");
				        responder.next();
				    }
				    number1 = responder.nextDouble();
				    System.out.println("The Circle's Circumference is: " + circleCircumference(number1));
					isShowExitScreen = true;
					break;
				case 5:
					System.out.println("Please enter the length of the opposite side:");
					while (!responder.hasNextDouble()) {
				        System.out.println("That's not a number!");
				        responder.next();
				    }
				    number1 = responder.nextDouble();
				    System.out.println("Please enter the length of the adjacent side:");
					while (!responder.hasNextDouble()) {
				        System.out.println("That's not a number!");
				        responder.next();
				    }
				    number2 = responder.nextDouble();
				    System.out.println("The Hypotenuse's Length is: " + lengthHypotenuse(number1,number2));
					isShowExitScreen = true;
					break;
				case 6:
					isShowExitScreen = false;
					isDone = true;
					System.out.println("Thanks for using the program");
					break;
				default:
					isShowExitScreen = false;
					System.out.println("Invalid Input!");
			}
			decide = null;
			if(isShowExitScreen) {
				error = true;
				System.out.println("Do you want to repeat? Type Y/N");
				while(error) {
					decide = responder.nextLine();
					if(decide.equals("Y") || decide.equals("y") || decide.equals("N") || decide.equals("n")) {
						if(decide.equals("Y") || decide.equals("y")) {
							isDone = false; 
						} else if (decide.equals("N") || decide.equals("n")) {
							isDone = true;
							System.out.println("Thanks for using the program");
						}
						error = false;
					}
				}
			}
		}
		responder.close();
	}
}

