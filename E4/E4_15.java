import java.util.Scanner;

public class E4_15 {

	public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);
		
		System.out.print("何cmから:");int a=stdIn.nextInt();
		System.out.print("何cmまで:");int b=stdIn.nextInt();
		System.out.print("何cmごと:");int c=stdIn.nextInt();
		
		System.out.println("身長　標準体重");
		
		for(int i=a;i<=b;i+=c) {
			System.out.println(i+" "+(i-100)*0.9);
		}

	}

}
