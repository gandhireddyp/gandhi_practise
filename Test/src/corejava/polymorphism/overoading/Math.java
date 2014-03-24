package corejava.polymorphism.overoading;

public class Math {
	
	public Integer add(Integer a, Integer b)
	{
		System.out.println("in Integer overloader");
		return a+b;
	}
	
	public long add(long a, long b){
		System.out.println("in long overloader");
		return a+b; 
	}
	

}
