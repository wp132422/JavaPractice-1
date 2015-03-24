package org.dimigo.basic;

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
				System.out.println(gsf + (300 * (gr/10 - 1)));
			} else {
				System.out.println(gsf + (300 * gr/10));
			}
			break;
		case 2:
			if(gr % 10 == 0) {
				System.out.println(kf + (200 * (gr/10 - 1)));
			} else {
				System.out.println(kf + (200 * gr/10));
			}
			break;
		default:
			if(gr % 10 == 0) {
				System.out.println(anotherf + (200 * (gr/10 -1)));
			} else {
				System.out.println(anotherf + (200 * gr/10));
			}
			break;
		}
	}
}

