package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		int fee = 0;
		String type = "고속버스";
		double distance = 20;
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		
		if(type=="고속버스"){
			if(distance%10!=0)
				fee=850+(int)(distance)/10*300;
			else
				fee=850+(int)(distance-1)/10*300;
		}
		
		else if(type=="경차"){
			if(distance%10!=0)
				fee=300+(int)(distance)/10*200;
			else
				fee=300+(int)(distance-1)/10*200;
		}
		
		else{
			if(distance%10!=0)
				fee=600+(int)(distance)/10*200;
			else
				fee=600+(int)(distance-1)/10*200;
		}
		
		System.out.println("거리 : "+(int)distance+"km");
		System.out.println("차종 : "+type);
		System.out.println("통행료 : "+fee+"원");
	}
}