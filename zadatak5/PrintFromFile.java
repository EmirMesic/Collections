package zadatak5;

import java.util.ArrayList;
import java.util.HashSet;

public class PrintFromFile {
	
	public static void printAllWords(ArrayList<String> all) {
		for(String word : all) {
			System.out.print(word + " ");
		}
	}

	public static void printUniqueWords(ArrayList<String> all) {
		HashSet<String> unique = new HashSet<String>();
		unique.addAll(all);
		
		for(String word : unique) {
			System.out.print(word + " ");
		}
	}
}