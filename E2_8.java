import java.util.Scanner;
import java.util.Random;

public class E2_8 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("整数値：");
		
		int a = stdIn.nextInt();
		int b = rand.nextInt(11)-5;
		
		System.out.println("その値の±5の乱数を生成しました。"
				+ "それは"+(a+b)+"です。");

	}

}
