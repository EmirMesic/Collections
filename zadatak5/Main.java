package zadatak5;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		Data.selectFile();
		ArrayList<Character> wovels = new ArrayList<Character>();
		wovels.add('A');
		wovels.add('O');
		wovels.add('E');
		wovels.add('I');
		wovels.add('U');
		ArrayList<String> words = new ArrayList<String>();
		words.addAll(Data.getAllWordsFromFile());

		System.out.println("Ukupan Broj rijeci je " + Data.getAllWordsFromFile().size());

		HashSet<String> uniqueWords = new HashSet<String>();

		uniqueWords.addAll(Data.getAllWordsFromFile());
		System.out.println("Ukupan broj unikatnih rijeci je " + uniqueWords.size());
		String word = "";
		int numberOfWovels = 0;
		int numberOfConsonants = 0;
		char slovo = 0;
		for (int i = 0; i < words.size(); i++) {
			word = words.get(i);
			
			for (int j = 0; j < word.length(); j++) {
				slovo = word.charAt(j);
				if (wovels.contains(Character.toUpperCase(slovo))) {
					numberOfWovels++;
				}
				else if (slovo != ' ' && Character.isLetter(slovo)) {
					numberOfConsonants++;
				}

			}
		}

		System.out.println("Broj samoglasnika je " + numberOfWovels);
		System.out.println("Broj suglasnika je " + numberOfConsonants);
	}
}
