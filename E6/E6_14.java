import java.util.Scanner;
import java.util.Random;

public class E6_14 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Random r=new Random();
		
		String[] month={"January","February","March","April","May","June",
				"July","August","September","October","November","December"};
		
		System.out.println("英語の月名を入力してください。");
		System.out.println("なお、先頭は大文字とします。");
		
		int retry;
		
		do {
		int a=r.nextInt(12)+1;
		while(true) {
			System.out.print(a+"月:");
			String ans=s.next();
			if(ans.equals(month[a-1]))break;
			System.out.println("違います。");
		}
		System.out.print("正解です。もう一度？ 1..Yes / 0..No:");
		retry=s.nextInt();
		
		}while(retry==1);
	}
}

