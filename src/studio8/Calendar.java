package studio8;

import java.util.HashSet;

public class Calendar {

	private HashSet<Appointment> set = new HashSet<Appointment>();
	
	public Calendar() {
		
	}
	
	public void addAppointment(Appointment a) {
		set.add(a);
	}
	
	public boolean isBusy(Date d, Time t) {
		return true;
	}
	
	@Override
	public String toString() {
		return "Calendar [set=" + set + "]";
	}

	public static void main(String[] args) {

		Calendar c = new Calendar();
		Date d = new Date(4, 6, 2023, false);
		Time t = new Time(13, 46, false);
		Appointment a = new Appointment(d, t, "doctor's office", 0.5);	
		Appointment b = new Appointment(d, t, "doctor's office", 0.5);
		c.addAppointment(a);
		c.addAppointment(b);
		System.out.println(c);

		
	}

}
