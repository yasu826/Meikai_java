import java.util.Scanner;

public class E3_18 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("何月ですか？");
		int a = stdIn.nextInt();
		
		switch(a) {
		
		case 12:
		case 1:
		case 2:System.out.print("冬");break;
		case 3:
		case 4:
		case 5:System.out.print("春");break;
		case 6:
		case 7:
		case 8:System.out.print("夏");break;
		case 9:
		case 10:
		case 11:System.out.print("秋");break;
		
		}
		

	}

}
