package Prag;

public class SimpleCharat {
	public static void main(String[] args) {  
        String str = "Welcome to Javatpoint portal";          
        for (int i=1; i<=str.length()-1; i=i+2) {  
           // if(i%2!=0) {  
                System.out.println("Char at "+i+" place "+str.charAt(i));  
            //}  
        }  
    } 
}
