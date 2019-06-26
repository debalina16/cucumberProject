/**
 * 
 */
package Prog1;

import java.util.Scanner;

/**
 * @author Debalina
 *
 */
class News implements Google {

	public void search(String data) {
		System.out.println("Search for news==>" + data);

	}
}

class Images implements Google {

	public void search(String data) {
		System.out.println("Search for images==>" + data);

	}
}

class Map implements Google {

	public void search(String data) {
		System.out.println("Search for map==>" + data);

	}
}

public class run {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Tab");
		String userInput = s.next();
		Google g = null;
		if (userInput.equals("images")) {
			g = new Images();
		} else if (userInput.equals("map")) {
			g = new Map();
		} else if (userInput.equals("news")) {
			g = new News();
		}
		g.search("Tendulkar");
	}
}
