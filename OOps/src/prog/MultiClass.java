package prog;


class Grandfather{
	void m(){
		System.out.println("Car");
	}
}
class Fathers extends Grandfather{
	void n(){
		System.out.println("Bike");
	}
}

public class MultiClass extends Fathers {

	public static void main(String[] args) {
		
	   MultiClass m1=new MultiClass();
		m1.m();
		m1.n();
		
	}
	
}
