
public class ageVoteSw {
	
	public static void main(String args[]){
	
		int age=60;
		
		switch(age){
		
		case 16:System.out.println("You are not eligible for voting");
		break;
		
		case 18:System.out.println("You are eligible for voting");
		break;
		
		case 60:System.out.println("You are Senior Citizen");
		break;
		
		default:System.out.println("Please give proper age selection");
		}
	}

}
