package exercise6;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

class DriverTravelPreparations {
	LocalTime time;
	LocalDate date;
	float speed;
	float distance;
	float totalTravelTime;
	int daysToCount;
	int remainingMinutes;

	DriverTravelPreparations(LocalDate date, LocalTime time, float speed, float distance) {
		this.time = time;
		this.date = date;
		this.speed = speed;
		this.distance = distance;
	}

	public void getTotalTravellingTime() {
		totalTravelTime = distance / speed;
		System.out.println(totalTravelTime);
	}

	public boolean isHoliday() {
		int day = date.getDayOfWeek().getValue();
		int dayDate = date.getDayOfMonth();
		int month = date.getMonthValue();
		if (day == 6 && dayDate > 7 && dayDate < 15) {
			System.out.println("Second Saturday");
			return true;
		}
		if (day == 7) {
			System.out.println("Sunday");
			return true;
		}
		if ((dayDate == 1 && month == 1) || (dayDate == 26 && month == 1) || (dayDate == 15 && month == 7)) {
			System.out.println("Government Holiday");
			return true;
		}
		return false;
	}
	
	public void calculateDays() {
		float totalTravelTimeInMinutes = totalTravelTime * 60;
		System.out.println(totalTravelTimeInMinutes);
		float remainingTimeInCurrentDay = time.until(LocalTime.MAX, ChronoUnit.MINUTES) + 1;

		while (true) {
			
			if(isHoliday()) {
				remainingTimeInCurrentDay = 60 * 8;
				date = date.plusDays(1);
				continue;
			}
			
			totalTravelTimeInMinutes -= remainingTimeInCurrentDay != 0
					? remainingTimeInCurrentDay % 480 == 0 ? 480 : remainingTimeInCurrentDay
					: 0;
			
			System.out.println(date + " Remaining distance: " + totalTravelTimeInMinutes);
			remainingTimeInCurrentDay = 60 * 8;
			
			if (remainingTimeInCurrentDay > totalTravelTimeInMinutes) {
				int hours = (int)totalTravelTimeInMinutes/60;
				int minutes = (int)totalTravelTimeInMinutes%60;
				LocalTime finalTime = LocalTime.of(hours, minutes);
				date = date.plusDays(1);
				System.out.println(date + " Remaining distance: " + totalTravelTimeInMinutes);
				
				System.out.println("Destination will be reached on: " + date + " at " + finalTime);
				return;
			}

			date = date.plusDays(1);
		}
	}

}