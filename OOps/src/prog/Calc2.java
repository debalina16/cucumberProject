package prog;

public class Calc2 {

	void add(){
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	void add(int a){
		int b=23;
		System.out.println(a+b);
	}
	void add(int a,int b,int c){
		System.out.println(a+b+c);
	}
	void add(float a){
		float b=20.34f;
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		Calc2 c2=new Calc2();
		c2.add();
		c2.add(23);
		c2.add(23,67,56);
		c2.add(23.43f);
		

	}

}
