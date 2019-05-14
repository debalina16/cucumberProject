

//Java program to initialize the values from one object to another  
	class copycon{  
	    int id;  
	    String name;  
	    //constructor to initialize integer and string  
	    copycon(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    //constructor to initialize another object  
	    copycon(copycon s){  
	    id = s.id;  
	    name =s.name;  
	    }  
	    void display(){System.out.println(id+" "+name);}  
	   
	    public static void main(String args[]){  
	    	copycon s1 = new copycon(111,"Karan");  
	    	copycon s2 = new copycon(s1);  
	    s1.display();  
	    s2.display();  
	   }  
	}  
