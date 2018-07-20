import java.util.Scanner;

public class E4_14 {

	public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);
		
		System.out.print("nの値:");
		int a=stdIn.nextInt();
		
		int sum=0;
		for(int i=1;i<=a;i++) {
			if(i<a) {
			System.out.print(i+" + ");
		     sum+=i;
			}else if(i==a) {
		    	   System.out.print(i+" = ");
	         sum+=i;
			}
		}System.out.println(sum);
		}

}
