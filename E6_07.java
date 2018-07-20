import java.util.Scanner;
import java.util.Random;
public class E6_07 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		Random rand=new Random();
		
		final int n=12;
		int[]a=new int[n];
		
		for(int i=0;i<n;i++)
			a[i]=rand.nextInt(10);
			
		System.out.println("配列の全要素の値");
		System.out.print("{");
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("}");
		
		System.out.print("探す数値：");
		int key=stdIn.nextInt();
		
		int i;
		for(i=0;i<n;i++) 
			if(a[n-1-i]==key)
				break;
		
		if(i<n)
			System.out.println("それはa["+(n-1-i)+"]にあります。");
		else
			System.out.println("それはありません。");
		
		}

	}
