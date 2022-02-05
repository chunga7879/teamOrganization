package main.model.subTasks;

public class Date {

	public int year = 2022;
	public int month;
	public int day;

	public Date(int month, int day) {
		this.month = month;
		this.day = day;
	}

	public String stringFormat() {
		return year + "-" + month + "-" + day;
	}

	public int getMonth() {
		return this.month;
	}

	public int getDay() {
		return this.day;
	}

	// if d1 is later than or equal to d2, it is true
	public static boolean compareTwoDate(Date d1, Date d2) {
		if (d1.year > d2.year) {
			return true;
		} else if (d1.year == d2.year && d1.month > d2.month) {
			return true;
		} else if (d1.year == d2.year && d1.month == d2.month && d1.day >= d2.day) {
			return true;
		}
		return false;
	}

}
