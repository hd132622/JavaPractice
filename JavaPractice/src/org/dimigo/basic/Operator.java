package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		int a = 9, b = 10;
		double h1 = 5.8, h2 = 5.4;
		double s = (a+b)*h1*0.5;
		double p = a*h2;
		
		
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.println("사다리꼴 넓이 : "+s);
		System.out.println("평행사변형 넓이 : "+p);
		
		if(s>p)
			System.out.println("사다리꼴이 평행사변형보다 "+(s-p)+" 더 큽니다.");
		
		else if(s<p)
			System.out.println("평행사변형이 사다리꼴보다 "+(p-s)+" 더 큽니다.");
		
		else 
			System.out.println("평행사변형과 사다리꼴의 넓이가 같습니다.");
	}

}
