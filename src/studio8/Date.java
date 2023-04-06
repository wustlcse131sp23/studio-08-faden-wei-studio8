package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {
	
	private int month;
	private int day;
	private int year;
	private boolean isHoliday;

	/**
	 * 
	 * @param m, month of the year between 1 and 12
	 * @param d, day of the month between 1 and 31
	 * @param y, the present year 
	 * @param holiday, is the given day a holiday
	 */
	public Date (int m, int d, int y, boolean holiday) {
		month = m;
		day = d;
		year = y;
		isHoliday = holiday;
	}
	
    @Override
	public String toString() {
		return "Date [month=" + month + ", day=" + day + ", year=" + year + "]";
	}

	public static void main(String[] args) {
		Date dayOne = new Date (4, 6, 2023, false);
		Date dayTwo = new Date (4, 7, 2021, false);
		Date dayThree = new Date (4, 7, 2021, false);
		Date dayFour = new Date (4, 7, 2021, false);
		Date dayFive = new Date (4, 7, 2021, false);
//		LinkedList<Date> list = new LinkedList<Date>();
//		list.add(dayOne);
//		list.add(dayTwo);
//		list.add(dayThree);
//		list.add(dayFour);
//		list.add(dayFive);
		HashSet<Date> set = new HashSet<Date> ();
		set.add(dayOne);
		set.add(dayTwo);
		set.add(dayThree);
		set.add(dayFour);
		set.add(dayFive);
		System.out.println(set);
		
    	//System.out.print(dayOne.equals(dayTwo));

    }

	@Override
	public int hashCode() {
		return Objects.hash(day, month);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month;
	}

}
