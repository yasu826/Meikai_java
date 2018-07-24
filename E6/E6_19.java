import java.util.Scanner;

public class E6_19 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.print("クラス数：");
		int classes=s.nextInt();
		int[][]tensu=new int[classes][];
		System.out.println();
		
		int count=0;
		for(int i=0;i<tensu.length;i++) {
			System.out.print((i+1)+"組の人数：");
			int student=s.nextInt();
			count+=student;
			tensu[i]=new int[student];
			for(int j=0;j<tensu[i].length;j++) {
				System.out.print((i+1)+"組"+(j+1)+"番の点数：");
				tensu[i][j]=s.nextInt();
			}
			System.out.println();
		}
		
		System.out.println("  組  ｜　合計　  平均");
		System.out.println("--------------------");
		
		double[] sums=new double[classes];
		double[] aves=new double[classes];
		for(int i=0;i<classes;i++) {
			for(int j=0;j<tensu[i].length;j++) {
				sums[i]+=tensu[i][j];
				aves[i]=sums[i]/tensu[i].length;
			}
			System.out.printf("%2d組　｜　%3.1f  %3.1f\n",i+1,sums[i],aves[i]);
		}
		
		System.out.println("--------------------");
		
		double sum=0;
		for(int i=0;i<tensu.length;i++) {
			for(int j=0;j<tensu[i].length;j++) {
				sum+=tensu[i][j];
			}
		}
		double ave=sum/count;
		System.out.printf("  計　｜　%3.1f  %3.1f",sum,ave);
		
		

	}

}
