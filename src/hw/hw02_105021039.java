package hw;
import java.util.Scanner;
public class hw02_105021039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		int h=scr.nextInt();
		int a=scr.nextInt();
		if(a==1){
			double w=(h-80)*0.7;
		System.out.print("�k�ͪ��з��魫��:"+ w);
		}else{
			if(a==2){
				double w=(h-70)*0.6;
				System.out.print("�k�ͪ��з��魫��:"+ w);
			}
		}
	}

}
