import java.util.Scanner;

public class E3_01 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数値：");
		int a = stdIn.nextInt();
		
		if(a>=0)
			System.out.print("その絶対値は"+a+"です。");
		else
			System.out.print("その絶対値は"+(-a)+"です。");

	}

}
