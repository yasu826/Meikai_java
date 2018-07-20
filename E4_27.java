import java.util.Random;
import java.util.Scanner;
public class E4_27 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		Random rand=new Random();
		
		int number=rand.nextInt(100);
		int limit=6;
		
		System.out.println("0~99の数を当ててください。");
		System.out.println("制限回数は６回です。");
		
		int x;
		int count=0;
		do {
			System.out.print("いくつ？");
			x=stdIn.nextInt();
			
			count++;
			
			if(x>number)
				System.out.println("もっと小さい。");
			else if(x<number)
				System.out.println("もっと大きい。");
			else if(x==number)
				System.out.println("ビンゴ！！");
			
			if(count==limit) {
			    System.out.println("正解は"+number+"です。");break;
			}    
			}while(x!=number);
		
	}

}
