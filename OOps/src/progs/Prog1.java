package progs;

class Employee16{
	int salary=19299;
	void dev(){
		System.out.println("Java");
	}
}
public class Prog1 extends Employee16 {
    int bonus=12233;
    void test(){
    	System.out.println("Selenium");
    }
	public static void main(String[] args) {
		Prog1 p1=new Prog1();
		System.out.println("Bonus:"+p1.bonus);
		System.out.println("Salary:"+p1.salary);
		p1.dev();
		p1.test();
		
	}
}
