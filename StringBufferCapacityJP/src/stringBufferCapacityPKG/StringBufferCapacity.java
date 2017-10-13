package stringBufferCapacityPKG;          // Package declared 

// This program shows how the string buffer capacity changes

public class StringBufferCapacity {                   // declared and defined a class

	public static void main(String[] args) {                 // main method
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer();            // created an object of StringBuffer class
		
		System.out.println();                              // printing blank line
		System.out.println("Defualt Capacity of String Buffer is : "+sb.capacity()); // printing default capacity
		
		sb.append("Happy Deepavali To All :) ");    // appending a string value
		
		System.out.println();                                   // printing blank line
		System.out.println("Change in Capacity of String Buffer is (Old Capacity*2+2) : "+sb.capacity());   // printing a capacity after appending
		
        sb.append("Happy Deepavali To All :) Have Lots Of Sweet");                            // appending a string value
		
        System.out.println();                                     // printing blank line
		System.out.println("Change in Capacity of String Buffer is (Old Capacity*2+2) : "+sb.capacity()); // printing a capacity after appending

	}

}
