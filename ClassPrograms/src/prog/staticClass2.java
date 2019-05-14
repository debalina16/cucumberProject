package prog;

public class staticClass2 {
static void add(int a,int b){
	System.out.println("Summation="+(a+b));
	
}
static int sub(int a,int b,int c){//argument passing through parameters
	return a-b;
	
}
public static void main(String args[]){
	
	add(10,50);//parameters
	add(10,40);
	int result=sub(10,20,30);
	System.out.println("Substraction="+result);
	
}
}
