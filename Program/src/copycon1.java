
      class copycon1{  
	    int id;  
	    String name;  
	    copycon1(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	   copycon1(){}  
	    void display(){System.out.println(id+" "+name);}  
	   
	    public static void main(String args[]){  
	    	copycon1 s1 = new copycon1(111,"Karan");  
	    	copycon1 s2 = new copycon1();  
	    s2.id=s1.id;  
	    s2.name=s1.name;  
	    s1.display();  
	    s2.display();  
	   }  
	}  

