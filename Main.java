import java.util.Scanner;

import com.sun.corba.se.spi.orbutil.fsm.Input;

public class Main {

	private Scanner scanner = new Scanner(System.in);

	
	public static void main(String[] args) {

		Main main = new Main();

		Computation computation;

		if (main.shouldMultiply()) {
			computation = new Multiplication();
		} else {
			computation = new Addition();
		}

		double argument1 = main.getArgument();
		double argument2 = main.getArgument();
		double argument3 = main.getArgument();

		double result = computation.compute(argument1, argument2, argument3);
		System.out.println("Wynik: " + result);
	}

	private boolean shouldMultiply() {
		System.out.println(
				"Jaka operacje chcesz wykonac? Napisz M jesli ma to byc mnozenie i nacisnij <Enter>. Mazdy inny wybor oznacza dodawanie.");

		return scanner.next().equals("M");
	}

	private double getArgument() {
		System.out.println("Podaj liczbe: ");

		return scanner.nextDouble();
	}

}