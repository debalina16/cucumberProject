package prog;

public class method4 {
	static int a;
	static int b;
	int c;
	int d;
	void assign(int a1,int b1,int c1,int d1){
		a=a1;
		b=b1;
		c=c1;
		d=d1;
	}
	void paint(){
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
	}
	public static void main(String args[]){
		method4 obj=new method4();
		obj.assign(10, 20, 30, 40);
		obj.paint();
		obj.assign(50, 70, 90, 80);
		obj.paint();
		method4 obj1=new method4();
		obj1.paint();
	}
}
