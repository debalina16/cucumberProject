
        class refercon{  
		void m(){  
		System.out.println(this);//prints same reference ID  
		}  
		public static void main(String args[]){  
		refercon obj=new refercon();  
		System.out.println(obj);//prints the reference ID  
		obj.m();  
		}  
		}  

