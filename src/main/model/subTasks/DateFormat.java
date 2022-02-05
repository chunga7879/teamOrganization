package main.model.subTasks;

public class DateFormat {

	int year = 2022;
	int month;
	int day;

	public DateFormat (int month, int day) {
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

	public int compareTwoDate(DateFormat d1, DateFormat d2) {

	}


}
