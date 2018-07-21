import java.util.Scanner;
public class E7_02 {
	
	static int min(int a,int b, int c) {
		int min=a;
		if(b<min)min=b;
		if(c<min)min=c;
		return min;
	}

	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
		
		System.out.println("３つ数字を入力してください。それらの最小値を求めます。");
		System.out.print("整数a：");int a=s.nextInt();
		System.out.print("整数b：");int b=s.nextInt();
		System.out.print("整数c：");int c=s.nextInt();
		System.out.println("最小値は"+min(a,b,c)+"です。");
	}
}
