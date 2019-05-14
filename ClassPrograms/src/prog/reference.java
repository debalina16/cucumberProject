package prog;

public class reference {
 
	void main(){
	 System.out.println(this);	
	}
	
	
public static void main(String args[]){
	reference r=new reference();
	System.out.println(r);
	r.main();
}
}
