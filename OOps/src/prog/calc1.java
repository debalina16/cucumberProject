package prog;

public class calc1 {

	void add(){
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	void add(int a){
		int b=20;
		System.out.println(a+b);
	}
	void add(float a){
		float b=20.23f;
		System.out.println(a+b);
	}
	void add(int a,int b){
		System.out.println(a+b);
	}
	void add(int a,int b,int c){
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		calc1 c1=new calc1();
		c1.add();
		c1.add(10);
		c1.add(10.67f);
		c1.add(23, 23);
		c1.add(12, 33, 31);
		c1.add('c');
	}
}
