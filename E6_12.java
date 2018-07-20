import java.util.Random;
import java.util.Scanner;

public class E6_12 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		Random rand=new Random();
		
		System.out.print("要素数：");
		int n=stdIn.nextInt();
		int[]a=new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=rand.nextInt(10)+1;
			System.out.println("a["+i+"]="+a[i]);
		}
	 
		System.out.println("配列の要素をシャッフルしました。");
		for(int i=0;i<n;i++) {
			int b=rand.nextInt(10)+1;
			int t=a[i];
			a[i]=a[b];
			a[b]=t;
		}
		for(int i=0;i<n;i++) 
		    System.out.println("a["+i+"]="+a[i]);
	}
}
