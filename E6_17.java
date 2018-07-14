import java.util.Random;

public class E6_17 {

	public static void main(String[] args) {
		Random r=new Random();
		
		int[][]tensu=new int[6][2];
		
		System.out.println("         国語　数学");
		System.out.println("ーーーーーーーーーーー");
		for(int i=0;i<6;i++) {
			System.out.print("生徒["+(i+1)+"]  ");
			for(int j=0;j<2;j++) {
				tensu[i][j]=r.nextInt(100)+1;
				System.out.printf("%3d  ",tensu[i][j]);
			}
			System.out.println();
		}

		System.out.println();
		
		double ave1=0;
		for(int i=0;i<6;i++) {
			ave1+=tensu[i][0];
		}
		ave1/=6;
		
		double ave2=0;
		for(int i=0;i<6;i++) {
			ave2+=tensu[i][1];
		}
		ave2/=6;

		System.out.println("科目ごとの平均点");
		System.out.printf("国語：%.2f\n",ave1);
		System.out.printf("数学：%.2f\n",ave2);
		System.out.println();
		
		System.out.println("生徒ごとの平均点");
		for(int i=0;i<6;i++) {
			System.out.print("生徒["+(i+1)+"]  ");
			System.out.println((tensu[i][0]+tensu[i][1])/2);
		}
		
		
	}

}
