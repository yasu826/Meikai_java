import java.util. Scanner;

public class E6_18 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("行数：");
		int gyou=s.nextInt();
		int[][]a=new int[gyou][];
		
		System.out.println();
		
		System.out.println("各行の列数：");
		for(int i=0;i<a.length;i++) {
			System.out.print("a["+i+"]...");
			int retsu=s.nextInt();
			a[i]=new int[retsu];
		}
		
		System.out.println();
		
		System.out.println("各要素の値：");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print("a["+i+"]["+j+"]=");
				a[i][j]=s.nextInt();
			}
			System.out.println();
		}
		
		System.out.println();
		
		System.out.println("結果を表示");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.printf("%3d",a[i][j]);
			}
			System.out.println();
		}
	}
}
