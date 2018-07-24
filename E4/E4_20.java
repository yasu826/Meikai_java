import java.util.Scanner;
public class E4_20 {

	public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);
		
		System.out.print("何段の正方形を作りますか:");
		int a=stdIn.nextInt();
		
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a;j++) {
				System.out.print("*");
				if(j==a)
					System.out.println();
		}
			}

	}

}
