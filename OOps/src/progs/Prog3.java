package progs;

class Employee1{
	int salary=19299;
	void dev(){
		System.out.println("Java");
	}
}
class Programmer1 extends Employee1 {
    int bonus=12233;
    void test(){
    	System.out.println("Selenium");
    }
}   
   class Prog3 extends Employee1{
	   int expenses=23415;
       void school(){
    	   System.out.println("QTP");
       }
	public static void main(String[] args) {
		Prog3 p1=new Prog3();
		//System.out.println("Bonus::"+p1.bonus);
		System.out.println("Salary::"+p1.salary);
		System.out.println("Expenses::"+p1.expenses);
		p1.dev();
		//p1.test();
		p1.school();
		
		
	}
}

