/**
 * 
 * @author johnpaulthomas
 * Driver class
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class HashMapDriver {

	public static void main(String[] args) {
		
		archaicWords<String, String> archaicDictionary = new archaicWords<String, String>();

		String fileName = "DictionaryWordValuePairs.xlsx";
		
		try {
			Scanner data = new Scanner(new File(fileName));
			archaicDictionary.readFile(data);
		}//end try
		catch (FileNotFoundException e ) {
			System.out.println("File not found: "+ e.getMessage());
		}//end catch
		
		
		System.out.println(archaicDictionary.keySet());
		System.out.println(archaicDictionary.values());
	}//end main method

}//end class
