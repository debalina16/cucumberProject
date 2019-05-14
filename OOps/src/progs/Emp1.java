package progs;

public class Emp1 {  
	int id;  
	String name;  
	Addresses address;  
	  
	public Emp1(int id, String name,Addresses address) {  
	    this.id = id;  
	    this.name = name;  
	    this.address=address;  
	}  
	  
	void display(){  
	System.out.println(id+" "+name);  
	System.out.println(address.city+" "+address.state+" "+address.country);  
	}  
	  
	public static void main(String[] args) {  
	Addresses address1=new Addresses("Kolkata","WB","india");  
	Addresses address2=new Addresses("Badkulla","WB","india");  
	  
	Emp1 e=new Emp1(111,"Debalina",address1);  
	Emp1 e2=new Emp1(112,"Aritra",address2);  
	      
	e.display();  
	e2.display();  
	      
	}  
	}  
