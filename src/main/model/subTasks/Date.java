package main.model.subTasks;

public class Date {

	int year = 2022;
	int month;
	int day;

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

//	public int compareTwoDate(Date d1, Date d2) {
//		if (d1.year > d2.)
//	}


}
