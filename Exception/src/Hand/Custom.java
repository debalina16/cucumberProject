package Hand;

public class Custom {
	
	static void validate(int age) throws IllegalException {
		if(age>18) {
			System.out.println("Welcome to Vote");
		}else {
			throw new IllegalException("Not Applicable for voting");
		}
	}	
	public static void main(String args[]) throws IllegalException{
		try {
			  validate(13);
	        }
		catch(Exception i)
		    {
			  System.out.println("Exception is :"+i);
		
		    }
		finally {
			System.out.println("Rest of the code...");
		}
		
	}

}
