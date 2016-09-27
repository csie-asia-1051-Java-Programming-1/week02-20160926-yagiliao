package hw;
import java.util.Scanner;
public class hw01_105021039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr=new Scanner(System.in);
		int n=scr.nextInt();
		int a=scr.nextInt();
		int o=scr.nextInt();
		int p=scr.nextInt();
		int m =a*15+o*20+p*30;
		int x1=(n-p)/50;
		if(m<=n){
			System.out.println("共找回:"+ "\n50元硬幣"+ x1 +"個");
			System.out.println("5元硬幣"+ x1/5+"個");
			System.out.println("1元硬幣"+ x1%5+"個");
		}else{
			System.out.println(0);
		}
	}

}
