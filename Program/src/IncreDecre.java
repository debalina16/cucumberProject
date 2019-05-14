
public class IncreDecre {
	
	public static void main(String args[]){
		
		int a=0;
		int b=2;
		int sum=(--a -a-- - --a + ++b - ++b - b++ + --a +a-- + --a - b++ + ++b - --a -a-- - --a - --b);
		System.out.println(sum);
		System.out.println(a);
		System.out.println(b);
	}

}
