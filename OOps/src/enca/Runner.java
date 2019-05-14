package enca;

public class Runner {

	public static void main(String[] args) {
		Encap e1=new Encap();
		System.out.println(e1.getA());
		System.out.println(e1.getName());
		System.out.println(e1.getC());
		e1.setA(459);
		e1.setName("Debarati");
		System.out.println(e1.getA());
		System.out.println(e1.getName());
		Encap e2=new Encap();
		System.out.println(e2.getA());
		System.out.println(e2.getName());
	}
}
