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
			System.out.println("�@��^:"+ "\n50���w��"+ x1 +"��");
			System.out.println("5���w��"+ x1/5+"��");
			System.out.println("1���w��"+ x1%5+"��");
		}else{
			System.out.println(0);
		}
	}

}
