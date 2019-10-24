import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CurrentTimeTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCurrentTime() {
		CurrentTime ct = new CurrentTime();
		assertNotNull(ct);
	}

	@Test
	public void testGetSeconds(){
		long input = 1000;
		CurrentTime ct = new CurrentTime(input);
		long actual = ct.getSeconds();
		long expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testGetCurrentSeconds(){
		long input = 61 * 1000;
		CurrentTime ct = new CurrentTime(input);
		long actual = ct.getCurrentSeconds();
		long expected = 1;
		assertEquals(expected, actual);
		
		input = 61;
		ct = new CurrentTime(input);
		actual = ct.getCurrentSeconds();
		expected = 0;
		assertEquals(expected, actual);
		
		
	}
	
	@Test 
	public void getMinutes(){
		long input = 1000 * 60;
		CurrentTime ct = new CurrentTime(input);
		long actual = ct.getMinutes();
		long expected = 1;
		assertEquals(expected, actual);
	}
	
	
	@Test 
	public void getCurrentMinutes(){
		long input = 1000 * 60 * 61;
		CurrentTime ct = new CurrentTime(input);
		long actual = ct.getCurrentMinutes();
		long expected = 1;
		assertEquals(expected, actual);
	}
	
	
	@Test 
	public void getHours(){
		long input = 1000 * 60 * 60 * 2;
		CurrentTime ct = new CurrentTime(input);
		long actual = ct.getHours();
		long expected = 2;
		assertEquals(expected, actual);
	}
	
	@Test 
	public void getCurrentHours(){
		long input = 1000 * 60 * 60 * 25;
		CurrentTime ct = new CurrentTime(input);
		long actual = ct.getCurrentHours();
		long expected = 1;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testToString() {
		// TODO 
		//fail("Not yet implemented");
	}

}
