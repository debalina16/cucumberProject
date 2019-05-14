package prog;

public class student2 {

	int rollNo;
	String name,course;
	float fee;
	
	student2(int rollNo,String name,String course){
		this.rollNo=rollNo;
		this.name=name;
		this.course=course;
	}
	student2(int rollNo,String name,String course,float fee){
		this(rollNo,name,course);
	    this.fee=fee;
	}
	
	void print(){
		System.out.println(rollNo+" "+name+" "+course+" "+fee);
	}
	public static void main(String args[]){
		student2 s1=new student2(1,"Debalina","CSE",34000f);
		student2 s2=new student2(2,"Debarati","CSE",24000f);
		s1.print();
		s2.print();
	}
}
