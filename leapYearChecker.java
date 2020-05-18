
public class leapYearChecker {

	public int isLeapYear(int year) {
		
		if((year%400)==0)	
			return 1;	//All years divisible by 400 ARE leap years
		
		else {
			if((year%100)==0) {
				return 0;	//All years divisible by 100 but not by 400 are NOT leap years
			}
			
			else
				return 0;
		}
			
	}

}
