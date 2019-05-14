
public class clsStatic {
	
	int roll;
	String stream;
	static String col="Techno";
	
	clsStatic(int r,String s){
		roll=r;
		stream=s;
	}
	void display(){
	System.out.println(roll+","+stream+","+col);
	}
	public static void main(String args[]){
		
		clsStatic c00= new clsStatic(1,"CSE");
	    clsStatic c0= new clsStatic(2,"ECE");
		
	    c0.display();
		c00.display();
		
	};

}
