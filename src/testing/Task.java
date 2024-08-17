package testing;



import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Task {
	
	int a =10;
	int b =10;
	int c =5;
	String x =null;
	boolean y =true;
	boolean z =false;
	int [] num = {1,2,3,4};
	int [] num1 = {1,2,3,4};
	@Test
	public void eqals() {
		assertEquals(a, b);
	}
	
	@Test
	public void notEqulas() {
		assertNotEquals(a, c);
	}
	
	@Test
	public void same() {
		assertSame(a, b);
	}
	
	@Test
	public void notSame() {
		assertNotSame(a, c);
	}
	
	@Test
	public void nulls() {
		assertNull(x);
	}
	
	@Test
	public void notNull() {
		assertNotNull(a);
	}
	@Test
	public void isTrue() {
		assertTrue(y);
	}
	@Test
	public void isFalse() {
		assertFalse(z);
	}
	@Test
	public void array() {
		assertArrayEquals(num, num1);
	}
}
