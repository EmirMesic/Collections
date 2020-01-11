package zadatak1;

public class Main {

	public static void main(String[] args) {
		
		Data.selectFile();

		PrintFromFile.printAllWords(Data.getAllWordsFromFile());

		System.out.println("");
		
		PrintFromFile.printUniqueWords(Data.getAllWordsFromFile());
	}

}