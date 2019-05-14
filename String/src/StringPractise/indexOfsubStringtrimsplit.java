package StringPractise;

public class indexOfsubStringtrimsplit {

	public static void main(String[] args) {
		String str="Java Selenium";
		//indexOF() method
		System.out.println(str.indexOf('a'));
		System.out.println(str.indexOf('a', 2));
		System.out.println(str.indexOf('z',3));
		System.out.println(str.indexOf("Sel"));
		//subString() method
		System.out.println(str.substring(4));
		System.out.println(str.substring(6, 9));
        //trim() method
		String str1="           Java and Selenium          ";
		System.out.println(str1.length());
		str1=str1.trim();
		System.out.println(str1);
		System.out.println(str1.length());
		//split() method
		String arr[]=str.split(" ");
		System.out.println(arr.length);
			for(int i=arr.length-1;i>=0;i--)
			{
			  System.out.print(arr[i]+" ");		
			}
			System.out.println();
			System.out.println(arr[1]);
			for(int i=0;i<arr.length;i++){
				String str11=arr[i];
				for(int j=str11.length()-1;j>=0;j--){
					System.out.print(str11.charAt(j));
				}
				System.out.print(" ");
			}
			
	 }

}
