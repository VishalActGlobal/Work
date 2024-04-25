package practice_program;

import java.util.Arrays;
public class StringQuestion {
	public static void main(String[] args) {
		String s = "1AB2D3E4C";
		String s1 = "";
//		String num = "";
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (Character.isAlphabetic(ch)) {
				s1 += ch;
			} else {

				int num=Character.getNumericValue(ch);
				sum+=num;
			}
		}
		char ch1[] = s1.toCharArray();
		Arrays.sort(ch1);
		System.out.println(ch1);
		
		
//		int num1 = Integer.parseInt(num);
//		while (num1 > 0) {
//			int num2 = num1 % 10;
//			sum = num2 + sum;
//			num1 = num1 / 10;
//		}
//
		System.out.println("sum = " + sum);

	}
}
