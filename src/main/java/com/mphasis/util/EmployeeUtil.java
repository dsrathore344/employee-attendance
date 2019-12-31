package com.mphasis.util;

import java.sql.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;

public class EmployeeUtil {
	

	public static String getDate() {
		Date date = new Date(System.currentTimeMillis());
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
		return formatter.format(date);
	}
	
	public static String getTime() {
		Time time = new Time(System.currentTimeMillis());
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
		return formatter.format(time);
	}
}
