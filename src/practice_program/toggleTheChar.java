package practice_program;

public class toggleTheChar {
public static void main(String[] args) {
	String s="AjAy";
	String fin="";
	for (int i = 0; i < s.length(); i++) {
		char ch=s.charAt(i);
		if (Character.isUpperCase(ch)) {
			fin+=Character.toLowerCase(ch);
			
		} else {
			fin+=Character.toUpperCase(ch);

		}
	} 
	System.out.println(fin);
	
	
	
	
	
		char ch = s.charAt(0);
		char ch1=Character.toUpperCase(ch);
		
		String ss=ch1+s.toLowerCase().substring(1);
		System.out.println(ss);
	}

	
}

