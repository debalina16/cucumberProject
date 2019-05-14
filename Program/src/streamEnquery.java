
public class streamEnquery {

	public static void main(String args[]){
		
		int year=9;
		char stream='M';
		
		switch(year){
		
		case 1:System.out.println("English,Math,EVS");
		break;
		
		case 2:System.out.println("Second year");
           switch(stream){
		
		   case 'C':System.out.println("C,Control System,Electrical");
		   break;
		   
		   case 'E':System.out.println("C,Control System,Electrical Fundamentals");
		   break;
		   
		   case 'M':System.out.println("Mechanical,C,Designing");
		   break;
		}
		case 3:System.out.println("Third year");
        switch(stream){
		
		   case 'C':System.out.println("C++,Data Structure,Electronics");
		   break;
		   
		   case 'E':System.out.println("Data Structure,Electrical and Electronics");
		   break;
		   
		   case 'M':System.out.println("Data Structure,Mechanics II");
		   break;
		}
           
           
		  break;
           default:System.out.println("Invalid Data Entry");
	}
}}
