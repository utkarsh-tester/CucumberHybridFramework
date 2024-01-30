package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonUtils {
	
	public static final int IMPLICIT_WAIT_TIME=10;
	public static final int PAGE_LOAD_TIME=15;
	public static final int EXPLICIT_WAIT_BASIC_TIME=30;
	
	public String getEmailWithTimeStamp() {
		
		SimpleDateFormat timeFormat = new SimpleDateFormat("HHmmss");
		Date currentTime = new Date();
		String formattedTime = timeFormat.format(currentTime);
		return "rohitsharma"+formattedTime.toString().replace(" ", " ").replace(":", " ")+"@gmail.com";
	
	}

}
