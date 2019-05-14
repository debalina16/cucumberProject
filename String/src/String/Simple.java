package String;

public class Simple {
	public static void main(String[] args) {
		String s="      I Love Java        ";
		String[] arr=s.split(" ");
		int count=0;
		System.out.println(s.length());
		//System.out.println("value"+s);
		String str="";
		for(int i=0;i<arr.length;i++){
			str=str+arr[i];
		}
		System.out.println(arr.length);
		int str1=s.length()-arr.length;
		System.out.println("Blank Spaces:"+str1);
		
		/*char[] ch=str.toCharArray();
		System.out.println(ch);
		for(char c:ch){
			count++;
		}
		System.out.println(count);
		int str2=s.length()-count;
		System.out.println("Blank Spaces:"+str2);
		*/

	}

}
