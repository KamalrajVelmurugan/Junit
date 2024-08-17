package testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestCalss {
	
		
		@Before
		public void beforecase() {
			System.out.println("welcome");
		}
		
		@Test
		public void testCase() {
			System.out.println("This is test Case");
		}
		
		@After
		public void aftercase() {
			System.out.println("Thank you");
		}
	
}
