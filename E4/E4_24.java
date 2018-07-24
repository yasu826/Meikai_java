import java.util.Scanner;

public class E4_24 {
	public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);
		
		System.out.print("整数値：");
		int a=stdIn.nextInt();
		
		for(int i=2;i<=a-1;i++) {
			if(a%i==0) {
				System.out.println(a+"は素数ではありません。");break;
			}if(i==a-1)
				System.out.print(a+"は素数です。");
			}
		}
	}
