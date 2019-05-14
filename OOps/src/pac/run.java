package pac;

public class run {

	public static void main(String[] args) {
		System.out.println("====HDFC====");
		Hdfc h1=new Hdfc();
		h1.carloan();
		h1.personalloan();
		h1.eduloan();
		h1.hdfcInsurance();
		h1.rulesAndregulations();
		System.out.println("====ICICI====");
		Icici c1=new Icici();
		c1.carloan();
		c1.personalloan();
		c1.eduloan();
		c1.iciciInsurance();
		c1.rulesAndregulations();
		System.out.println("====Dummy====");
		Dummy1 d1=new Dummy1();
		d1.carloan();
		d1.personalloan();
		d1.eduloan();
		d1.creditcard();
		d1.rulesAndregulations();
		System.out.println("====upcasting1====");
		Rbi r1=new Hdfc();
		r1.carloan();
		r1.personalloan();
		r1.eduloan();
		r1.rulesAndregulations();
		System.out.println("====upcating2====");
		Rbi r2=new Dummy1();
		r2.carloan();
		r2.personalloan();
		r2.eduloan();
		r2.rulesAndregulations();
		System.out.println("====upcasting3====");
		Dummy r3=new Dummy1();
		r3.carloan();
		r3.personalloan();
		r3.eduloan();
		r3.creditcard();
		r3.rulesAndregulations();
	}
}
