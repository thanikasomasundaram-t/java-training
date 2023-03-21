package exercise6;

import java.util.Scanner;

public class LorryTransportation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Hello Client, please share your requirements");

		System.out.println("Enter Start Date:");
		String startDate = sc.nextLine();

		System.out.println("Enter Start Time:");
		String startTime = sc.nextLine();

		System.out.println("Enter speed of the vehicle transporting your goods:");
		float speed = sc.nextFloat();

		System.out.println("Enter the final destination distance:");
		float distance = sc.nextFloat();

		DateAndTime obj = new DateAndTime(startDate, startTime);
		DriverTravelPreparations driverTravelPreparations = new DriverTravelPreparations(obj.getDate(), obj.getTime(), speed, distance);
		driverTravelPreparations.getTotalTravellingTime();
		driverTravelPreparations.calculateDays();
		
		sc.close();
	}
}
