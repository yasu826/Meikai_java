import java.util.Scanner;

public class E4_03 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("整数a:");
		int a =stdIn.nextInt();
		System.out.print("整数b:");
		int b =stdIn.nextInt();
		
		int max,min;
		
		if(a>=b) {
			max=a;
			min=b;
		}else {
			max=b;
		    min=a;
		}
		
		do {
			System.out.println(min);
			min++;
			}while(min<=max);

	}

}
