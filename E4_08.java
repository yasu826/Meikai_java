import java.util.Scanner;

public class E4_08 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		System.out.print("整数:");
		int a=stdIn.nextInt();
		
		int keta=0;
		
		while((a%10)>0) {
			a/=10;
		    keta++;
		}
		System.out.println("その値は"+keta+"桁です。");
	}

}
