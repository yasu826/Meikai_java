import java.util.Scanner;
public class E5_06 {

	public static void main(String[] args) {
		System.out.println("float        2乗");
		System.out.println("-----------------------");
		
		for(float x=0.0F,y=0.0f;x<=1.0F;x+=0.001F,y++) {
			float v=(float)y/1000;
		    System.out.printf("%.7f    %.7f\n",x,v);
		}

	}

}
