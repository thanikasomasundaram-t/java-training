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
		if ((dayDate == 1 && month == 1) || (dayDate == 26 && month == 1) || (dayDate == 15 && month == 8)) {
			System.out.println("Government Holiday");
			return true;
		}
		return false;
	}
	
	public void calculateDays() {
		float totalTravelTimeInMinutes = totalTravelTime * 60;
		System.out.println(totalTravelTimeInMinutes);
		float timeRemaining = time.until(LocalTime.MAX, ChronoUnit.MINUTES) + 1;
		float remainingTimeInCurrentDay = timeRemaining;
		System.out.println("dddd" + remainingTimeInCurrentDay);

		while (true) {
			if(isHoliday()) {
				date = date.plusDays(1);
				remainingTimeInCurrentDay = 480;
				continue;
			}
			if(remainingTimeInCurrentDay >= totalTravelTimeInMinutes) {
				if(totalTravelTimeInMinutes >= 480) {
					totalTravelTimeInMinutes -= 480;
					remainingTimeInCurrentDay = 480;
					System.out.println(date + " Remaining distance: " + totalTravelTimeInMinutes + " min");
					if(totalTravelTimeInMinutes != 0) {
						date = date.plusDays(1);		
					}

				}
				else {
					if(totalTravelTimeInMinutes == 0) {
						totalTravelTimeInMinutes = 480;
					}
					int hours = (int)totalTravelTimeInMinutes/60;
					int minutes = (int)totalTravelTimeInMinutes%60;
					LocalTime finalTime = LocalTime.of(hours, minutes);
					System.out.println("Destination will be reached on: " + date + " at " + finalTime);
					return;
				}
			}
			else {
				if(totalTravelTimeInMinutes > remainingTimeInCurrentDay) {
					totalTravelTimeInMinutes -= remainingTimeInCurrentDay;
					remainingTimeInCurrentDay = 480;
					System.out.println(date + " Remaining distance: " + totalTravelTimeInMinutes + "min");
					date = date.plusDays(1);
				}
			}
			

			
		}
	}

}