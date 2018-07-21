import java.util.Scanner;
public class E7_01 {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("入力した整数の値によって以下のように表示します。");
		System.out.println("負：-1 0：0 正：1");
		System.out.print("整数を入力：");
		int n=s.nextInt();
		
		int judge=signOf(n);
		
		System.out.print(judge);
}
	
	static int signOf(int n) {
		int t=0;
		if(n==0)t=0;
		else if(n>0)t=1;
		else if(n<0)t=-1;
		return t;
	}
}