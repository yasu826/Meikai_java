import java.util.Scanner;

public class E3_13 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("整数a："); int a= stdIn.nextInt();
		
		System.out.print("整数b："); int b= stdIn.nextInt();
		
		System.out.print("整数c："); int c= stdIn.nextInt();
		
		int min=a;
		if(b<min)min=b;
	    if (c<min)min=c;
		
		int max= a;
		if(b>max)max=b;
	    if (c>max)max=c;
		
		int mid =a;
	    if(b!=min && b!=max) mid=b;
		if(c!=min && c!=max) mid=c;
		
		System.out.print("中央値は"+mid+"です。");
		

	}

}
