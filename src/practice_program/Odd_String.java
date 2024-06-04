package practice_program;
//Changes
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;

public class Odd_String {
	public static void main(String[] args) {
//		 String s = "24052024-0001";
//	        String[] parts = s.split("-");
//	        String lastNumberStr = parts[1];
//	        int lastNumber = Integer.parseInt(lastNumberStr);
//	        lastNumber++;
//	        String newLastNumberStr = String.format("%04d", lastNumber);
//	        String result = parts[0] + "-" + newLastNumberStr;
//	        System.out.println(result); // Output: 24052024-0002
		
		 SimpleDateFormat dateFormat = new SimpleDateFormat("ddMMyyyy");
	        String dateString = dateFormat.format(new Date());

	        // Ensure dateString has a hyphen by appending one
	        dateString += "-0000"; // Add any numeric value after the hyphen

	        // Extract the date part of the string (the part before the hyphen)
	        String[] parts = dateString.split("-");
	        String datePart = parts[0];
	        
	        int increment = Integer.parseInt(parts[1]);

	        for (int i = 0; i < 5; i++) {
	            // Check if the date has changed
	            String currentDate = dateFormat.format(new Date());
	            if (!currentDate.equals(dateString.substring(0, 8))) {
	                dateString = currentDate + "-0000";
	                parts = dateString.split("-");
	                datePart = parts[0];
	                increment = Integer.parseInt(parts[1]);
	            }

	            // Increment the last value
	            increment++;

	            // Format the incremented value with leading zeros
	            String incrementedValue = String.format("%04d", increment);

	            // Combine the date string and the incremented value
	            String result = datePart + "-" + incrementedValue;
	            System.out.println(result);
	        }
		}
	}


