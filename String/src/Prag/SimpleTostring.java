package Prag;

public class SimpleTostring {
  
		 int rollno;  
		 String name;  
		 String city;  
		  
		 SimpleTostring(int rollno, String name, String city){  
		 this.rollno=rollno;  
		 this.name=name;  
		 this.city=city;  
		 }  
		   
		 public String toString(){//overriding the toString() method  
		  return rollno+" "+name+" "+city;  
		 }  
		 public static void main(String args[]){  
			 SimpleTostring s1=new SimpleTostring(101,"Raj","lucknow");  
			 SimpleTostring s2=new SimpleTostring(102,"Vijay","ghaziabad");  
		     
		   System.out.println(s1);//compiler writes here s1.toString()  
		   System.out.println(s2);//compiler writes here s2.toString()  
		 }  
		}  

