package prog;

class Super{
	final void m1(){
		System.out.println("This is m1:");
	}
	final void m1(int a){
		System.out.println("this is m2:"+a);
	}
	void m1(int a,int b){
		System.out.println("this is m3:"+a+" "+b);
	}
	void m1(float a){
		System.out.println("this is m4:"+a);
	}
}

public class Superduper extends Super {
	
	void m1(int a,int b){
		System.out.println("this is sub-m3:"+a+" "+b);
	}
	void m1(float a){
		System.out.println("this is sub-m4:"+a);
	}
	public static void main(String[] args) {
		Super s=new Superduper();
		s.m1();
		s.m1(10);
		s.m1(10,20);
		s.m1(30.56f);
		
	}
}
