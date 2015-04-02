package org.dimigo.basic;
//방현현우 녿노답
public class Condition {

	public static void main(String[] args) {
		int jong = 1; //jong이 1이면 고속버스 2이면 경차 3이면 나머지
		int gsf = 850; // 고속버스 요금
		int kf = 300; // 경차 요금
		int anotherf = 600; //나머지 요금
		int gr = 30; // 거리
		
		System.out.println("<< 고속도로 통행료 계산 >>");
		switch(jong) {
		case 1:
			if(gr % 10 == 0) {
				System.out.println("거리 : " + gr +"km");
				System.out.println("차종 : 고속버스");
				System.out.println("요금 : " + (gsf + (300 * (gr/10 - 1))) + "원");
			} else {
				System.out.println("거리 : " + gr +"km");
				System.out.println("차종 : 고속버스");
				System.out.println("요금 : " + (gsf + (300 * gr/10)) + "원");
			}
			break;
		case 2:
			if(gr % 10 == 0) {
				System.out.println("거리 : " + gr +"km");
				System.out.println("차종 : 경차");
				System.out.println("요금 : " + (kf + (200 * (gr/10 - 1))) + "원");
			} else {
				System.out.println("거리 : " + gr +"km");
				System.out.println("차종 : 경차");
				System.out.println("요금 : " + (kf + (200 * gr/10)) + "원");
			}
			break;
		default:
			if(gr % 10 == 0) {
				System.out.println("거리 : " + gr +"km");
				System.out.println("차종 : 나머지");
				System.out.println("요금 : " + (anotherf + (200 * (gr/10 -1))) + "원");
			} else {
				System.out.println("거리 : " + gr +"km");
				System.out.println("차종 : 나머지");
				System.out.println("요금 : " + (anotherf + (200 * gr/10)) + "원");
			}
			break;
		}
	}
}

