package org.dimigo.oop;

import java.util.Scanner;
	
	public class Score {
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("국어 점수 입력 : ");
			int kor = scanner.nextInt();

			System.out.print("수학 점수 입력 : ");
			int math = scanner.nextInt();
			
			System.out.print("영어 점수 입력 : ");
			int eng = scanner.nextInt();
			
			
			String sb = new StringBuilder()
			.append("\n<< 점수 출력 >>")
			.append("\n국어 점수 : ")
			.append(kor)
			.append("\n수학 점수 : ")
			.append(math)
			.append("\n영어 점수 : ")
			.append(eng).toString();
			
			System.out.println(sb);
			
			scanner.close();
	}

}
