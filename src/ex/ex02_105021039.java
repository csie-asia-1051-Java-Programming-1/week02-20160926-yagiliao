package ex;

import java.util.Scanner;
/*
 * Topic: 有一圓形，直徑為200，且中心座標為(0,0)。
 * 	請寫一支程式可以輸入「點」的座標，並判斷「點」是否在圓形的範圍內。
 * 	如果「點」的位置剛好在邊界的話也算是在圓形範圍內(例：x=100，y=0)。
 * Date: 2016/09/26
 * Author: 105021039 廖野吉
 */

public class ex02_105021039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		float x =scr.nextFloat();
		float y =scr.nextFloat();
		double x1=Math.pow(x,2);
		double y1=Math.pow(y,2);
		double m=x1+y1;
		double n= Math.sqrt(m);
		if(n<=100){
			System.out.print("是");
		}else{
			System.out.print("否");
		}
	}

}
