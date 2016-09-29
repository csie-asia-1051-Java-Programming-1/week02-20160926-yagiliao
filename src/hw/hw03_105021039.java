package hw;
import java.util.Scanner;
public class hw03_105021039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		int a=scr.nextInt();
		if(a%400==0){
			System.out.print("是潤年");
		}else{
			if(a%100==0){
				System.out.print("是平年");
			}else{
				if(a%4==0){
					System.out.print("是潤年");
				}else{
					System.out.print("是平年");
				}
			}
		}
	}

}
