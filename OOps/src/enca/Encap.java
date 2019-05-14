package enca;

public class Encap {
	private int a=10;
	private String name="Debalina";
	private int c=34;
	public int getA(){
		return a;	
	}
	public void setA(int a){
		this.a=a;
	}
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	public int getC(){
		return c;
	}
	public static void main(String[] args) {
		Encap e1=new Encap();
		System.out.println(e1.a);
		System.out.println(e1.name);
		System.out.println(e1.c);
	}

}
