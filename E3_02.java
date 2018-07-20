import java.util.Scanner;

public class E3_02 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数A:");
		int a = stdIn.nextInt();
		
		System.out.print("整数B：");
		int b = stdIn.nextInt();
		
		if(a%b==0)
		    System.out.print("BはAの約数です。");
		else
		    System.out.print("BはAの約数ではありません。");

	}

}
