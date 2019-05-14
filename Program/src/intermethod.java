

//Creating interface that has 4 methods  
interface Aa{  
void aa();//by default, public and abstract  
void bb();  
void cc();  
void dd();  
}  
  
//Creating abstract class that provides the implementation of one method of A interface  
abstract class Bb implements Aa{  
public void cc(){System.out.println("I am C");}  
}  
  
//Creating subclass of abstract class, now we need to provide the implementation of rest of the methods  
class M extends Bb{  
public void aa(){System.out.println("I am a");}  
public void bb(){System.out.println("I am b");}  
public void dd(){System.out.println("I am d");}  
}  
  
//Creating a test class that calls the methods of A interface  
class intermethod{  
public static void main(String args[]){  
Aa ab=new M();  
ab.aa();  
ab.bb();  
ab.cc();  
ab.dd();  
}}  


