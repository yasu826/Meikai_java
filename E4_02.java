import java.util.Scanner;
import java.util.Random;

public class E4_02 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		Random rand=new Random();
		
		int number=rand.nextInt(90)+10;
		
		System.out.println("10~99の数を当ててください。");
		
		int x;
		do {
			System.out.print("いくつ？");
			x=stdIn.nextInt();
			
			if(x>number)
				System.out.println("もっと小さい。");
			else if(x<number)
				System.out.println("もっと大きい。");
			}while(x!=number);
		
		System.out.println("ビンゴ！！");

	}

}
