package prog;

class father{
	int a=10;
	void property(){
		System.out.println("Father's property");
	}
}
class son extends father{
	int b=20;
	void sonProperty(){
		System.out.println("Son's property");
	}
}

public class sonFather {
	public static void main(String args[]){
	System.out.println("...Father Details...");	
	father f=new father();
	f.property();
	System.out.println(f.a);
	System.out.println("...Son Details...");
	son s=new son();
	s.property();
	System.out.println(s.a);
	s.sonProperty();
	System.out.println(s.b);
	
	}
}
