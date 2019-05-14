package progs;

class car {
car(){
	System.out.println("Car data follows");
}
}

class Bike extends car{  
    int speed;  
      
    Bike(){System.out.println("constructor is invoked");}  
   
    {System.out.println("instance initializer block invoked");}  
       
    public static void main(String args[]){  
    Bike b1=new Bike();  
    Bike b2=new Bike();  
    }      
}  