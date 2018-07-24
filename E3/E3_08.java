import java.util.Scanner;

public class E3_08 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("点数：");
		int a = stdIn.nextInt();
		
		if(0<=a&&a<=59)
			System.out.print("不可");
		else if (60<=a&&a<=69)
			System.out.print("可");
		else if (70<=a&&a<=79)
			System.out.print("良");
		else if (80<=a&&a<=100)
			System.out.print("優");
	}

}
