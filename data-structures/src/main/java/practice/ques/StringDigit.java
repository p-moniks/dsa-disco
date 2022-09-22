package practice.ques;

import java.util.Scanner;

public class StringDigit {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		String input = sc.next();
		String inp = "13ag41";
//		sc.close();
		System.out.println(stringDigit(inp));

//		
	}

	// 36ac1 = 14
	private static int stringDigit(String str) {
		int result = -404;
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (Character.isDigit(c))
				sum += Character.getNumericValue(c);
			else
				sum += Character.getNumericValue(c) - 9;
		}

//		

		System.out.println("sum:" + sum);
		result = sum / 3 == 0 ? sum / 3 : sum % 3;

		return result;
	}

	private static void util() {

		System.out.println(Character.getNumericValue('9'));
//		System.out.println(Character.getNumericValue('b')-9);
//		System.out.println(Character.getNumericValue('J'));
//		String[] s1 = str.split("[a-z]",-1);
//		List<String> s1list = Arrays.asList(s1);
//		Set<String> numSet =  new HashSet<String>(s1list);
//		System.out.println(s1list);
//		System.out.println(numSet);
//
//		String[] s2 = str.split("[0-9]");
//		List<String> s2list = Arrays.asList(s2);
//		System.out.println(s2list);
//		
//		for(String s :numSet) {
//			sum += sumOfDig(s);
//		}

		String s1 = "John";
		String s2 = new String("John");
		String s3 = "John";
		String s4 = s1.intern();// )

//		System.out.println(s1 == s4);
//		System.out.println(s2 == s3);
//		System.out.println(s4 == s3);
//		System.out.println(s3 == s1);

	}
}
