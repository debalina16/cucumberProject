package progs;

class Employee{
	int salary=19299;
	void dev(){
		System.out.println("Java");
	}
}
class Prog extends Employee {
    int bonus=12233;
    void test(){
    	System.out.println("Selenium");
    }
}   
   class Prog2 extends Prog{
	   int expenses=2345;
       void school(){
    	   System.out.println("Child Education");
       }
	public static void main(String[] args) {
		Prog2 p1=new Prog2();
		System.out.println("Bonus:"+p1.bonus);
		System.out.println("Salary:"+p1.salary);
		System.out.println("School:"+p1.expenses);
		p1.dev();
		p1.test();
		p1.school();
		
		
	}
}
