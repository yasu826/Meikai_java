
public class E6_03 {

	public static void main(String[] args) {
		double[]a=new double[5];
		
		for(int i=0;i<a.length;i++) {
			double b=i+1;
			a[i]=b+b/10;
			System.out.println("a["+i+"]="+a[i]);
		}

	}

}
