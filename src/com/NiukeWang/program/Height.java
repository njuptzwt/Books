package com.NiukeWang.program;

import java.util.Scanner;

public class Height {
	public static double getJourney(int high) {
		double temp = high;
		double total = 0;
		for (int i = 1; i < 5; i++) {
			temp = temp / 2;
			total += 2 * temp;
		}
		return total + high;
	}

	public static double getTenthHigh(int high) {
		double temp=high;
		for (int i = 1; i < 6; i++) {
			temp = temp / 2;
		}
		return temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		Double journey = getJourney(height);
		Double TenthHeight = getTenthHigh(height);
		System.out.println(journey);
		System.out.println(TenthHeight);

	}

}
//	public static void main(String[]args){
//        Scanner in=new Scanner(System.in);
//        while(in.hasNext()){
//            int high=in.nextInt(); 
//            System.out.println(getJourney(high));
//            System.out.println(getTenthHigh(high));
//        }
//    }
//    public static double getJourney(int high)
//    {
//        double highSum=0;
//        double high1=high;
//        for(int i=1;i<=5;i++){
//            highSum+=high1+high1/2;
//            high1/=2;
//        }
//        highSum-=high1;
//        return highSum;
//    }
//    public static double getTenthHigh(int high)
//    {
//        double highSum=0;
//        double high1=high;
//        for(int i=1;i<=5;i++){
//            high1/=2;
//        }
// 
//        return high1;
// 
// 
//    }
//}