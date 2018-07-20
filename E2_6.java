import java.util.Scanner;

public class E2_6 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("三角形の面積を求めます。");
		
		System.out.print("底辺；");
        double a = stdIn.nextDouble();
		
		System.out.print("高さ；");
		double b = stdIn.nextDouble();
		
		double c = a*b/2;
		System.out.println("面積は"+c+"です。");
		
		
	}

}
