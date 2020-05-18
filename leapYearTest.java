import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author Sourav
 *
 */
class leapYearTest {
	
	leapYearChecker testObject;
	
	public void setUp() {
		
		testObject = new leapYearChecker();
	}

	@Test
	public void testLeapYearObject() throws Exception {
		
		assertNotNull(testObject);
	}
	
	@Test
	public void testLeapYear_t1Yes() throws Exception {
		
		assertTrue(testObject.isLeapYear(2000));
	}

}
