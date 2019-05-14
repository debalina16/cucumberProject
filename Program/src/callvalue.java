
        class Grp{  
		int rollno;  
		String name;  
		float fee;  
		Grp(int r,String n,float f){  
		rollno=r;  
		name=n;  
		fee=f;  
		}  
		void display(){System.out.println(rollno+" "+name+" "+fee);}  
		}  
		  
		class callvalue{  
		public static void main(String args[]){  
		Grp s1=new Grp(111,"ankit",500f);  
		Grp s2=new Grp(112,"sumit",600f);  
		s1.display();  
		s2.display();  
		}}  
	

