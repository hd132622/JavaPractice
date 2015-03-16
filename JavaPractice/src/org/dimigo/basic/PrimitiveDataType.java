package org.dimigo.basic;

public class PrimitiveDataType {

	public static void main(String[] args) {
		String name = "아이유";
		boolean gender = true;
		int age = 23;
		double height = 161.8;
		float weight = 44.3f;
		char bloodType = 'A';
		
		
		System.out.println("<< 아이유 프로필 >>");
		System.out.println("이름 : "+name);
		if(gender==true){
			System.out.println("성별 : 여자");
		}
		else System.out.println("성별 : 남자");
		System.out.println("나이 : "+age+'세');
		System.out.println("키 : "+height+"cm");
		System.out.println("몸무게 : "+weight+"kg");
		System.out.println("혈액형 : "+bloodType+'형');
	}

}