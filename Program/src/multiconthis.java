
          class S
          {  
        	   int rollno;  
        	   String name,course;  
        	   float fee;  
		    S(int rollno,String name,String course)
		    {  
		    	this.rollno=rollno;  
		    	this.name=name;  
		    	this.course=course;  
		    }  
		    S(int rollno,String name,String course,float fee)
		    {  
		    	this(rollno,name,course);//reusing constructor  
		    	this.fee=fee;  
		    }  
		    void display()
		    {
		    	System.out.println(rollno+" "+name+" "+course+" "+fee);
		    }  
		}  
		class multiconthis
		{  
			public static void main(String args[])
			{  
				S s1=new S(111,"ankit","java");  
				S s2=new S(112,"sumit","java",6000f);  
				s1.display();  
				s2.display();  
		    }
		}  

