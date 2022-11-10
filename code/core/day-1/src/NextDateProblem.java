
public class NextDateProblem {
	
	public static void main(String[] args) {
		//10/11/2022 - 11/11/2022

		/*
		 * 1. leap year
		 * 2. we need to care about no of days in a month
		 * 3. logic to calculete next date
		 * 
		 */
		
		int month, year, day;
		
		day=28;
		month=2;
		year=2001;
		
		printDate(month, year, day);
		
		day++;
		if(day> getNoOfWaysInAnMonth(month, year)) {
			day=1;
			month++;
			if(month>12) {
				month=1;
				year++;
			}
		}
		
	
		System.out.println(isLeapYear(2000));
		System.out.println(getNoOfWaysInAnMonth(11, 2000));
		
		printDate(month, year, day);
	}

	static void printDate(int month, int year, int day) {
		System.out.println(" Date : "+ day+"/"+month+"/"+year);
	}
	
	public static int getNoOfWaysInAnMonth(int month, int  year) {
		int noOfDays[]= {-1, 31,28,31,30,31,30,31,31,30,31,30,31 };
		if(isLeapYear(year))
			noOfDays[2]=29;
		return noOfDays[month];
	}
	public static boolean isLeapYear(int year) {
	    return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
	}
	
	

}











