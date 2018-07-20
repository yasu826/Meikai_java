import java.util.Scanner;
public class E4_16 {

	public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);
		
		System.out.print("何個＊を表示しますか:");
		int a=stdIn.nextInt();
		
		for(int i=1;i<=a;i++) {
			System.out.print("*");
			if(i%5==0)
				System.out.println("");
		}

	}

}
