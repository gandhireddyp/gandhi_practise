package corejava.memeory;

import corejava.equals_hashcode_toString.Person;

public class TestMemory {
	
	public static String abc= "ADDKLSJKHSDKJHDKJHDSKJHDSKJHDKJHDKJSHDKJHSKDHSKDH";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Person[] person = new Person[100];
		for(int i = 0; i<100; i++)
		{
			person[i] = new Person("Gandhi "+ i, i);
			System.out.println("object "+ i + " created");
		}
		
		String abc = "lakhsdlkadlaksdkljaldjalsd";
		int mb = 1024;
        
        //Getting the runtime reference from system
        Runtime runtime = Runtime.getRuntime();
         
        System.out.println("##### Heap utilization statistics [MB] #####");
         
        //Print used memory
        System.out.println("Used Memory:"
            + (runtime.totalMemory() - runtime.freeMemory()) / mb);
 
        //Print free memory
        System.out.println("Free Memory:"
            + runtime.freeMemory() / mb);
         
        //Print total available memory
        System.out.println("Total Memory:" + runtime.totalMemory() / mb);
 
        //Print Maximum available memory
        System.out.println("Max Memory:" + runtime.maxMemory() / mb);

	}

}
