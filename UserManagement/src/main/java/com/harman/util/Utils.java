package com.harman.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class Utils {

	/*
	 * @Autowired public JavaMailSender emailSender;
	 */

	public static Date convertStringToDate(String sDate) {
		Date date = null;
		if (null != sDate && sDate.length() > 4)
			try {
				date = new SimpleDateFormat("yyyy-MM-dd").parse(sDate);
			} catch (ParseException e) {

				e.printStackTrace();
			}
		return date;
	}
	
}