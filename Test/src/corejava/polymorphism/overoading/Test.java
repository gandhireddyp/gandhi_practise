package corejava.polymorphism.overoading;

import java.awt.print.Printable;

public class Test {

	
	/**
	 * this is to test that while determining the overloaded method for primitives,
	 *  JVM chooses widening over boxing.
	 * @param args
	 */
	
	public static void main(String[] args) {

		Math math = new Math();
		int a = 10;
		int b=5;
		System.out.println(math.add(a, b));
		System.out.println(print());
		//System.out.println(add(null));
	}
	
	private static Integer add(Integer a)
	{
		System.out.println("In Integer Method");
		return a+1;
	}
	
	private static Long add(Long a)
	{
		System.out.println("In Long Method");
		return a+1;
	}
	
	private static int print()
	{
		try{
			System.out.println("TRY");
			return 1;
		}finally{
			System.out.println("Finally");
			return 2;
		}
	}

}
