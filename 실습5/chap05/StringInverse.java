package chap05;

import java.util.Scanner;

public class StringInverse {
	public static void main(String[] args) {
		String s1 = "";
		String s2 = "";
		Scanner in = new Scanner(System.in);
		System.out.print("문자열을 입력하세요: ");
		s1 = in.next();
		int num = s1.length();
		
		for(int i = num - 1 ; i >= 0 ; i--)
		{
			s2 += s1.charAt(i);
		}
		
		System.out.println(s2);
	}
}
