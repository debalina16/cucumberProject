package prog;

public class SonW extends FatherW {

	void mrg(String girl){
		System.out.println("Super Girl");
	}
	void dowry(){
		System.out.println("NO Dowry");
	}
	void friends(){
		System.out.println("Friends");
	}
	public static void main(String[] args) {
		FatherW f1=new SonW();
		f1.dowry();
		f1.mrg("Silikona");
		f1.relations();
	}
}
