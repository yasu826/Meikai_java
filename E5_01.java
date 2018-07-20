import java.util.Scanner;
public class E5_01 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("整数値：");
		int n=stdIn.nextInt();
		
		System.out.print("８進数では");
		System.out.printf("%o",n);
		System.out.println("です。");
		System.out.print("16進数では");
		System.out.printf("%x",n);
		System.out.println("です。");

	}

}
