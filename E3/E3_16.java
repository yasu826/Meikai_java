import java.util.Scanner;

public class E3_16 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
        System.out.print("整数a："); int a= stdIn.nextInt();
		
		System.out.print("整数b："); int b= stdIn.nextInt();
		
		System.out.print("整数c："); int c= stdIn.nextInt();
		
		int max =a;
		int mid=b;
		int min=c;
		
		if(max<mid) {
			int t=max;max=mid;mid=t;
		}
		if(mid<min) {
			int t=mid;mid=min;min=t;
		}
		if(max<mid) {
			int t=max;max=mid;mid=t;
		}
		System.out.print(min+"<"+mid+"<"+max);
		
		    

	}

}
