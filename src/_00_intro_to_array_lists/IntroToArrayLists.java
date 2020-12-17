package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList<String> animals = new ArrayList<String>();
		//2. Add five Strings to your list
		animals.add("Crocodile");
		animals.add("Tree frog");
		animals.add("Donkey");
		animals.add("Fox");
		animals.add("Tiger");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < animals.size(); i++) {
			System.out.println(animals.get(i));
		}
		//4. Print all the Strings using a for-each loop
		for (String string : animals) {
			System.out.println(string);
		}
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < animals.size(); i++) {
			if (i % 2 == 0) {
			System.out.println(animals.get(i));	
			}

		}
		//6. Print all the Strings in reverse order.
		for (int i = animals.size()-1; i >= 0; i--) {
			System.out.println(animals.get(i));
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < args.length; i++) {
			if (animals.get(i).contains("e")) {
				System.out.println(animals.get(i));
			}
		}
	}
}
