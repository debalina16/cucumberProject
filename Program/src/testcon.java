

	class testcon{  
	    int id;  
	    String name;  
	    int age;  
	    //creating two arg constructor  
	    testcon(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    //creating three arg constructor  
	    testcon(int i,String n,int a){  
	    id = i;  
	    name = n;  
	    age=a;  
	    }  
	    void display(){System.out.println(id+" "+name+" "+age);}  
	   
	    public static void main(String args[]){  
	    	testcon s1 = new testcon(111,"Karan");  
	    	testcon s2 = new testcon(222,"Aryan",25);  
	    s1.display();  
	    s2.display();  
	   }  
	}  
