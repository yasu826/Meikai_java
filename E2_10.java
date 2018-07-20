import java.util.Scanner;

public class E2_10 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("姓：");
		String s1 = 	stdIn.next();
		
		System.out.print("名：");
		String s2 = stdIn.next();
		
		System.out.print("こんにちは"+s1+s2+"さん。");
		
	}

}
