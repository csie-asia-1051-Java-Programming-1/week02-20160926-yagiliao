package ex;

import java.util.Scanner;
/*
 * Topic: 假設某個停車場的費率是停車2小時以內，每半小時30元，超過2小時，但未滿4小時的部份，
 * 	每半小時40元，超過4小時以上的部份，每半小時60元，未滿半小時部分不計費。
 * 	如果您從早上10點23分停到下午3點20分，請撰寫程式計算共需繳交的停車費。
 * Date: 2016/09/26
 * Author: 105021039 廖野吉
 */

public class ex03_105021039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		int sh=scr.nextInt();
		int sm=scr.nextInt();
		int fh=scr.nextInt();
		int fm=scr.nextInt();
		int p;
		int a=((fh-sh)*60)+fm-sm;
		int b=a/30;
		if(b<=4){
			p=b*30;
			System.out.print("停車費用為:" + p);
		}else{
			if(b<=8){
				p=120 +(b-4)*40;
			}else{
				p=280+(b-8)*60;
				System.out.print("停車費用為:" + p);
			}
		}
	}

}