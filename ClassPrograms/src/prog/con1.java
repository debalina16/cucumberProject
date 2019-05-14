package prog;

public class con1 {
String name;
int age;
int rollNo;
String dept;
con1(){
	System.out.println("Execution from Here");
}
con1(String name,int age,int rollNo,String dept)
{
	System.out.println(this);
	this.name=name;
	this.age=age;
	this.rollNo=rollNo;
	this.dept=dept;
}
void print(){
	System.out.println("Name="+name);
	System.out.println("Age="+age);
	System.out.println("Roll No.="+rollNo);
	System.out.println("Department="+dept);
}
public static void main(String args[]){
	con1 c1=new con1();
	c1.print();
	con1 c2=new con1("Debalina",27,1,"CSE");
	c2.print();
	System.out.print(c2);
	con1 c3=new con1("Debarati",23,1,"EVS");
	c3.print();
	System.out.print(c3);
	con1 c4=new con1("Aritra",14,1,"VIII");
	c4.print();
	System.out.print(c4);
}
}
