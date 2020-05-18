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
	
	leapYearChecker testObject=new leapYearChecker();

	@Test
	public void testLeapYearObject() throws Exception {
		
		assertNotNull(testObject);
	}
	
	@Test
	public void testLeapYear_t1Yes() throws Exception {		
		
		assertEquals(1,testObject.isLeapYear(2000));	//year divisible by 400
	}
	
	@Test
	public void testLeapYear_t2No() throws Exception {		
		
		assertEquals(0,testObject.isLeapYear(1700));	//year not divisible by 400 but divisible by 100
	}
	
	@Test
	public void testLeapYear_t3Yes() throws Exception {		
		
		assertEquals(1,testObject.isLeapYear(2012));	//year not divisible by 400 and 100, but divisible by 4
	}
	
	@Test
	public void testLeapYear_t4No() throws Exception {		
		
		assertEquals(0,testObject.isLeapYear(2017));	//year not divisible by 400, 100 and 4
	}
	
	@Test
	public void testLeapYear_t5Yes() throws Exception {		
		
		assertEquals(1,testObject.isLeapYear(2016));	//year not divisible by 400 and 100, but divisible by 4
	}
	

}
