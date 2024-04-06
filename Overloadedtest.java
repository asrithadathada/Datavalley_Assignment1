import java.util.*;
public class Overloadedtest {
	public int add(int x,int y) {
		return x+y;
	}
	public double add(double x,double y,double z) {
		return x+y+z;
	}
	public String add(String s1,String s2) {
		return s1+s2;
	}
	public static void main(String args[]) {
		Testoverload obj=new Overloadedtest();
		System.out.println(obj.add(10,20));
		System.out.println(obj.add(1.4,2.3,4.56 ));
		System.out.println(obj.add("Harika", "Gadde"));
	}
}
