package zadatak3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		HashSet<Integer> uniqueNumbers = new HashSet<Integer>();
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int number;
		int sum = 0;
		System.out.println("Enter round numbers (press '0' to confirm): ");
		while ((number = input.nextInt()) != 0) {
			numbers.add(number);
		}
		System.out.println("");
		
		numbers.toString();

		System.out.print("Do you want to see: \n\n1.  Sum of all numbers \n2.  Average of numbers"
				+ "\n31. Even numbers sum \n32. Odd numbers sum \n33. Even positioned numbers sum \n34. Odd positioned numbers sum"
				+ "\n4.  Unique numbers \n5.  Repeating numbers");
		int menuChoice = input.nextInt();

		
		switch (menuChoice) {
		case 1:
			for (Integer integer : numbers) {
				sum += integer;
			}
			System.out.println(sum);
			break;
		case 2:
			for (Integer integer : numbers) {
				sum += integer;
			}
			System.out.println((double) sum / numbers.size());
			break;
		case 31:
			for (Integer integer : numbers) {
				if (integer % 2 == 0)
					sum += integer;
			}
			System.out.println(sum);
			break;
		case 32:
			for (Integer integer : numbers) {
				if (integer % 2 != 0)
					sum += integer;
			}
			System.out.println(sum);
			break;
		case 33:
			for(int i = 0; i<numbers.size(); i+=2) {
				sum+=numbers.get(i);
				System.out.println(numbers.get(i));

			}
			System.out.println(sum);
			break;
		case 34:
			for(int i = 1; i<numbers.size(); i+=2) {
				sum+=numbers.get(i);
				System.out.println(numbers.get(i));
			}
			System.out.println(sum);
			break;
		case 4:
			uniqueNumbers.addAll(numbers);
			System.out.println(uniqueNumbers.toString());
			break;
		case 5:
			Collections.sort(numbers);
			HashSet<Integer> repeatingNumbers = new HashSet<Integer>();
			for(int i=0;i<numbers.size()-1;i++) {
				if(numbers.get(i).equals(numbers.get(i+1))){
					repeatingNumbers.add(numbers.get(i));
				}
			}
			for (Integer integer : repeatingNumbers) {
				System.out.println(integer);
			}
			break;

		default:
			break;
		}
		
		
	}
}
