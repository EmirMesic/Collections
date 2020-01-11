package zadatak2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int number;
		
		System.out.println("Enter round numbers (press '0' to confirm): ");
		
		
		while ((number = input.nextInt()) != 0) {
			numbers.add(number);
		}
		
		
		System.out.println("Do you want to 'sort'(1), 'shuffle'(2) or 'reverse sort'(3) the numbers? ");
		int menuChoice = input.nextInt();

		switch (menuChoice) {
		case 1:
			Collections.sort(numbers);
			break;
		case 2:
			Collections.shuffle(numbers);
			break;
		case 3:
			Collections.sort(numbers, Collections.reverseOrder());
			break;

		default:
			break;
		}
		
		for (Integer integer : numbers) {
			System.out.print(integer + " ");
		}

	}
}
