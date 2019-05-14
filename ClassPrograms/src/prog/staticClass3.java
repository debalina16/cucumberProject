package prog;

public class staticClass3 {
	static int add(int a,int b){
		System.out.println("Summation="+(a+b));
		return a+b;
		
	}
	static int sub(int a,int b,int c){//argument passing through parameters
		return a-b;
		
	}
	static int multi(int a,int b){
		return a*b;
		
	}
	static int div(int a,int b){
		return a/b;
		
	}
	static int mod(int a,int b){
		return a%b;
		
	}
	
	public static void main(String args[]){
		int sum=add(10,23);
		
		int sub=sub(30,25,24);
		System.out.println(sub);
		
		int multi=multi(sum,sub);
		System.out.println(multi);
		
		int div=div(sum,sub);
		System.out.println(div);
		
		int mod=mod(sum,sub);
		System.out.println(mod);
		
		staticClass3 opr=new staticClass3();
		
		opr.add(23,45);
		System.out.println(opr.sub(23,12,23));
		staticClass3.add(23,34);
		
		int sub1=staticClass3.sub(23,33,2);
		
		int multi1=staticClass3.multi(21,12);
		
		int div1=staticClass3.div(sub1,multi1);
		
		System.out.println(sub1);
		
		System.out.println(multi1);
		
		System.out.println(div1);
		
		int div2=opr.div(20,5);
		
		System.out.println(div2);
}}