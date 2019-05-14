package String;

public class Test6 {

	public static void main(String[] args) {
		String str="I love Java";
		int count=0;
		int count1=0;
		char[] ch=str.toCharArray();
		for(char c:ch){
			System.out.println(c);
			count++;
		}
		System.out.println("count:"+count);
		System.out.println("====Integer====");
		int arr[]={1,2,3,5,6};
		for(int a:arr){
			System.out.println(a);
			count1++;
		}
		System.out.println("count:"+count1);
	}
}
