package studio8;

import java.util.Objects;

public class Appointment {
	private Date date;
	private Time time;
	private String location;
	private double duration;

	public Appointment(Date d, Time t, String locale, double duration) {
		date = d;
		time = t;
		location = locale;
		this.duration = duration;

	}



	@Override
	public int hashCode() {
		return Objects.hash(date, duration, location, time);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date)
				&& Double.doubleToLongBits(duration) == Double.doubleToLongBits(other.duration)
				&& Objects.equals(location, other.location) && Objects.equals(time, other.time);
	}



	@Override
	public String toString() {
		return "Appointment [date=" + date + ", time=" + time + ", location=" + location + ", duration=" + duration
				+ "]";
	}

	
	public Date getDate() {
		return date;
	}

	public static void main(String args[]) {
		Date date = new Date(6, 7, 2024, false);
		Time time = new Time(14, 30, true);
		Appointment appointment = new Appointment(date, time, "doctor's office", 0.5);

		System.out.println(appointment.toString());

	}

}
