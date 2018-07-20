import java.util.Scanner;

public class E3_07 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("正の整数値：");
		int a = stdIn.nextInt();
		
		if(a>=0) {
			if(a%3==0)
				System.out.print("その値は３で割り切れます。");
		    else if(a%3==1)
			System.out.print("その値を３で割った余りは１です。");
		     else if (a%3==2) 
			System.out.print("その値を３で割った余りは２です。");
			}else
			System.out.print("正でない値が入力されました。");
				

	}

}
