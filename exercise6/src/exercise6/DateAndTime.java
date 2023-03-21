package exercise6;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateAndTime {

	String startDate;
	String startTime;
	String[] timeArray;
	String[] dateArray;

	DateAndTime(String startDate, String startTime) {
		this.startDate = startDate;
		this.startTime = startTime;
	}

	public LocalDate getDate() {
		dateArray = this.startDate.split("-");

		LocalDate date = LocalDate.of(
				Integer.parseInt(dateArray[2]),
				Integer.parseInt(dateArray[1]),
				Integer.parseInt(dateArray[0])
		);
		return date;
	}

	public LocalTime getTime() {
		timeArray = this.startTime.split(":");

		LocalTime time = LocalTime.of(
				Integer.parseInt(timeArray[0]),
				Integer.parseInt(timeArray[1]),
				Integer.parseInt(timeArray[2])
		);
		return time;

	}

}


	// LocalTime todayMidNight = LocalTime.MAX;
//	
//	remainingTimeInCurrentDay = ChronoUnit.MINUTES.between(time, todayMidNight) + 1;

