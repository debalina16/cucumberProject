package prog;

public class calc {

calc(){
	this(10);
	System.out.println("Zero argument");
}
calc(int a){
	System.out.println("1-argument");
}
calc(int a,int b){
	this();
	System.out.println("2-argument");
}
public static void main(String args[]){
	calc c=new calc(10,20);
}
}
