package studio8;

import java.util.Objects;

public class Time {
	
	private int hour; 
	private int minute;
	private boolean inMilitaryTime;
	
	/**
	 * 
	 * @param h hours, between 0 and 23
	 * @param m minutes, between 0 and 59
	 * @param military, should time be displayed in 12 or 24 hopur format
	 */
	public Time(int h, int m, boolean military) {
		hour = h;
		minute = m;
		inMilitaryTime = military;
	}

	
	
	@Override
	public String toString() {
		if (inMilitaryTime) {
			return "Time [hour=" + hour + ", minute=" + minute + "]";
		}
		else {
			if (hour > 12) {
				return "Time [hour=" + (hour - 12) + ", minute=" + minute + "]";
			}
			else if (hour == 0) {
				return "Time [hour=" + 12 + ", minute=" + minute + "]";
			}
			else {
				return "Time [hour=" + hour + ", minute=" + minute + "]";
			}
		}
	}



	public static void main(String[] args) {
 
		Time current = new Time(15, 56, false);
		Time newTime = new Time (15, 56, false);
    	System.out.println(current.toString());
    }



	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}

}