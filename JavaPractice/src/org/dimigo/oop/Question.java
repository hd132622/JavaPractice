package org.dimigo.oop;

import java.util.Scanner;

public class Question {
	public static void main(String[] args) {
		System.out.println("가장 좋아하는 가수는?");
		Scanner scanner = new Scanner(System.in);
		String answer = scanner.nextLine();
		if(answer.equals("빅뱅")) System.out.println("정답입니다.");
		else System.out.println("틀렸습니다.");
		
		System.out.println("가장 좋아하는 배우는?");
		String answer2 = scanner.nextLine();
		if(answer2.equals("조인성")) System.out.println("정답입니다.");
		else System.out.println("틀렸습니다.");
		
		System.out.println("가장 좋아하는 과목은?");
		String answer3 = scanner.nextLine();
		if(answer3.equals("자바")) System.out.println("정답입니다.");
		else System.out.println("틀렸습니다.");
		
		scanner.close();
	}
}