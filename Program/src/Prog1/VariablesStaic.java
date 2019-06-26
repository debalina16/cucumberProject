/**
 * 
 */
package Prog1;

/**
 * @author Debalina
 *
 */
public class VariablesStaic {
 static int a;
 static int v;
 int b;
 public static void main(String[] args) {
	int a=10;
	System.out.println(a);
    System.out.println(VariablesStaic.a); 
    VariablesStaic vb=new VariablesStaic();
    System.out.println(vb.a);
    a=100;
    System.out.println(a);
    System.out.println(VariablesStaic.a);
    System.out.println(vb.a);
    VariablesStaic.a=500;
    System.out.println(a);
    System.out.println(VariablesStaic.a);
    System.out.println(vb.a);
    vb.a=2300;
    System.out.println(a);
    System.out.println(VariablesStaic.a);
    System.out.println(vb.a);
    System.out.println("============================");
    System.out.println(v);
    System.out.println(vb.b);
    vb.v=1000;
    vb.b=2000;
    System.out.println(vb.v);
    System.out.println(vb.b);
    VariablesStaic vb1=new VariablesStaic();
    vb1.v=999;
    vb1.b=300;
    System.out.println(vb1.v);
    System.out.println(vb1.b);
    VariablesStaic vb2=new VariablesStaic();
    System.out.println(vb2.v);
    System.out.println(vb2.b);
	}

}
