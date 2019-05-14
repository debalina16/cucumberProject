package pac;

public class Arun implements I1,I2 {

	public void m1(){System.out.println("Hello");}
	public void m2(){System.out.println("Java");}
	public void m3(){System.out.println("Love you");}
	public static void main(String[] args) {
	
    I1 i1=new Arun();
	i1.m1();
	i1. m2();
	i1. m3();

	I2 i2=new Arun();
	i2.m1();
	i2. m2();
	
	}
	
}
