package prog;

public class employee {

	static String comName="IBM";
	static String address="Manyata";
	String empName;
	String dept;
	int empID;
	int age;
	int salary;
	    employee(){
			System.out.println("====Employee Details====");
	    }
		employee(int empID,String empName,int age,String dept,int salary){
			this.empID=empID;
			this.empName=empName;
			this.age=age;
			this.dept=dept;
			this.salary=salary;
		}
		void print(){
			System.out.println("Employee Details:"+comName+" "+address+" "+empID+" "+empName+" "+age+" "+dept+" "+salary);
		}
		public static void main(String args[]){
			new employee();
			employee e1=new employee(05503,"Debalina",27,"CSE",50000);
			e1.print();
			employee e2 =new employee(05504,"Debarati",23,"EVS",40000);
			e2.print();
			employee e3 =new employee(05505,"Malancha",29,"ECE",52000);
			e3.print();
			employee e4 =new employee(05506,"Saurabh",28,"ECE",51000);
			e4.print();
		}
	
}
