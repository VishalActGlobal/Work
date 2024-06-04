package practice_program;
import java.io.*;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Base64;
public class ByteStreamToFile {

	 public static void main(String[] args) {
	        String base64DwgString ="";
	        try {
	            // Decode the Base64 string to bytes
	            byte[] dwgBytes = Base64.getDecoder().decode(base64DwgString);

	            // Write the bytes to a DWG file on the D drive
	            String filePath = "D:/output.dwg";
	            try (OutputStream outputStream = new FileOutputStream(filePath)) {
	                outputStream.write(dwgBytes);
	            }

	            System.out.println("DWG file has been written to: " + filePath);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	}