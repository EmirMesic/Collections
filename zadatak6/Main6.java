package zadatak6;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		Scanner word = new Scanner(System.in);
		System.out.println("Unesi ime fajla: ");
		String fileName = input.next();
		File newFile = new File(fileName);

		if (!newFile.exists()) {
			newFile.createNewFile();
		}

		FileWriter writer = new FileWriter(fileName);
		writer.write("Mirsad Emir \nJa Ti \nMe You");

		System.out.println("Unesite trazenu rijec: ");
		String wordToFind = word.next();

		LinkedHashMap<String, Integer> wordsFormFile = new LinkedHashMap();
		@SuppressWarnings("resource")
		Scanner lineScan = null;
		String line = null;
		int wordPosition = 0;
		int linePosition = 0;
		
		Scanner fileScan = new Scanner(new FileReader(fileName));
		System.out.println(fileScan.hasNext());
		while (fileScan.hasNextLine()) {
			System.out.println("a");
			linePosition++;
			line = fileScan.nextLine();
			lineScan = new Scanner(line);
			
			while (lineScan.hasNext()) {
				lineScan.next();
				wordPosition++;
			}
		}

		System.out.println("Text ima " + linePosition + " linija i " + wordPosition + " rijeci");

		
		
		
		
		
		
		
		
		
		
		writer.close();
		
	}
}