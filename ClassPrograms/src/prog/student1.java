package prog;

public class student1 {

	int rollID;
	String name;
	float fee;
	
	void entry(int rollID,String name,float fee){
		
		/*rollID=rollID;
		name=name;
	    fee =fee;*/
		this.rollID=rollID;
		this.name=name;
	    this.fee =fee;
		
	}
	void print(){
		System.out.println(rollID+" "+name+" "+fee);
	}
	
	public static void main(String args[]){
	student1 s=new student1();
	student1 s1=new student1();
	s.entry(1,"Debalina",34000.23f);
	s.print();
	s.entry(6,"Deba",34000.23f);
	s.print();
		
	}
}
