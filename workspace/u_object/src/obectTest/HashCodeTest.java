package obectTest;

import java.util.Random;

public class HashCodeTest {
	public static void main(String[] args) {
		Random random = new Random();
		
		// JVM이 제공하는 Id값, 주소값이 아님  
		System.out.println(random.hashCode());
		
	}
}	
