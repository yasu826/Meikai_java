import java.util.Scanner;
import java.util.Random;

public class E2_9 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		Random rand = new Random();
		
		double a = rand.nextDouble();
		int b = rand.nextInt(10);
		int c = rand.nextInt(2);
		
		System.out.println("0.0以上1.0未満の実数値:"+a);
		System.out.println("0.0以上10.0未満の実数値："+(a+b));
		System.out.println("-1.0以上1.0未満の実数値："+(-c+a));

	}

}
