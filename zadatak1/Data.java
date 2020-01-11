package zadatak1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Data {
	private static ArrayList<String> allWordsFromFile = new ArrayList<String>();
	private static Scanner input = new Scanner(System.in);
	private static String word;

	public static void selectFile() {
		System.out.println("Enter file name: ");
		try {
			input = new Scanner(new FileReader(input.next()));
		} catch (FileNotFoundException e) {
			System.out.println("The file was not found");
		}
		while (input.hasNext()) {
			word = input.next();
			allWordsFromFile.add(word);
		}

	}

	public static void readWordsFromFile() {
	}

	public static ArrayList<String> getAllWordsFromFile() {
		return allWordsFromFile;
	}
}
