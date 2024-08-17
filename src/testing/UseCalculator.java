package testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;


import org.junit.Test;

public class UseCalculator {

	
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
			
			
		
		@Test
		public void adding() {
			System.out.println("Addition");
			assertEquals(c.add(5,5),100);
		}
		@Test
		public void sub() {
			
			assertSame(c.sub(5,5),0);
		}
		@Test
		public void multiplay() {
			
			assertEquals(c.mul(5,5),25);
		}
		@Test
		public void divide() {
			assertNotEquals(c.div(5, 5), 5);
		}

}
