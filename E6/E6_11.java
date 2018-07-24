import java.util.Random;
import java.util.Scanner;

public class E6_11 {
	
	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		Random rand=new Random();
		
		System.out.print("要素数：");
		int n=stdIn.nextInt();
		int[]a=new int[n];
		
		a[0]=rand.nextInt(10)+1;
		for(int i=1;i<n;i++) {
			a[i]=rand.nextInt(10)+1;
			for(int j=0;j<i;j++) {
				if(a[i]==a[j])
					a[i]=a[j]-1;
			}
		}
		
		for(int i=0;i<n;i++) 
			System.out.println("a["+i+"]="+a[i]);
		
	}
}
