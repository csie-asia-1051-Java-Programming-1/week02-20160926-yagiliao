package hw;
import java.util.Scanner;
public class hw03_105021039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		int a=scr.nextInt();
		if(a%4==0){
			System.out.print("�O��~");
		}else{
			if(a%100==0){
				System.out.print("�O���~");
			}else{
				if(a%400==0){
					System.out.print("�O��~");
				}else{
					System.out.print("�O���~");
				}
			}
		}
	}

}
