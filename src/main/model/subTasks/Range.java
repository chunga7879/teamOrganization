package main.model.subTasks;

public class Range {
	public Date startDate;
	public Date endDate;

	public Range(int startMonth, int startDay, int endMonth, int endDay) {
		startDate = new Date(startMonth, startDay);
		endDate = new Date(endMonth, endDay);
	}


	public Range(Date start, Date end) {
		startDate = start;
		endDate = end;
	}


	// if r1 is in range of r2, return true
	public static boolean compareTwoRange(Range r1, Range r2) {
		if (Date.compareTwoDate(r1.startDate, r2.startDate) && Date.compareTwoDate(r2.endDate, r1.endDate)) {
			return true;
		} else {
			return false;
		}
	}

}
