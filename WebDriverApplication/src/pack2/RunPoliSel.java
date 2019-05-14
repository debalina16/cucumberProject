package pack2;

import java.util.Scanner;  // Import the Scanner class
//import com.sun.java_cup.internal.runtime.Scanner;

interface Google{
	public void search(String data);
}

class News implements Google{

	public void search(String data) {
		System.out.println("Search for news==>"+data);
		
	}
	
}

class Map implements Google{

	public void search(String data) {
		System.out.println("Search for map==>"+data);
		
	}
	
}

class Images implements Google{

	public void search(String data) {
		System.out.println("Search for images==>"+data);
		
	}
	
}

class RunPoliSel{
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
		System.out.println("Enter Tab");

		String userInput = myObj.nextLine();  // Read user input
		
		Google g=null;
		if(userInput.equals("images")) {
			g=new Images();
		}else if (userInput.equals("map")) {
			g=new Map();
		}else if(userInput.equals("news")) {
			g=new News();
		}	
		g.search("Tendulker");


		
	}
}


	
	
	
	
	
	
	
	
	
	
	
