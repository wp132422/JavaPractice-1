package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		int saover = 9;
		int saunder = 10;
		double saheight = 5.8;
		int pover = 9;
		double pheight = 5.4;
		
		double sawide = (double)((saover+saunder)*saheight/2);
		double pwide = (double)(pover*pheight);
		
		double s= sawide-pwide;
		double p = pwide - sawide;
		
		System.out.println("사다리꼴 넓이 " + sawide);
		System.out.println("평행사변형 넓이 " + pwide);
		
		if(sawide>pwide) {
			System.out.println("사다리꼴이 평행사변형 보다 " + s + "더 큽니다");
		}
		
		else {
			System.out.println("평행사변형이 사다리꼴 보다 " + p + "더 큽니다");
		}
		
	}

}
