import java.util.Scanner;

public class E6_05 {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		
		 System.out.print("要素数：");
		 int n=stdIn.nextInt();
		 int[]a=new int[n];
		 
		 for(int i=0;i<n;i++) {
			 System.out.print("a["+i+"]=");
			 a[i]=stdIn.nextInt();
		 }
		 System.out.print("a={");
		 for(int i=0;i<n;i++) {
			 System.out.print((i+1==n)?a[i]:a[i]+",");
		 }
		 System.out.print("}");
	}
	

}
